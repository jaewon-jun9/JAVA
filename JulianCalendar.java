public class JulianCalendar {//각 월의 날짜 수, 1년 1월 1일 월요일, 을 기초데이터로 율리우스력 작성
     public static int[] getMonthdata(int year) { //월별 날짜 수 
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};//1월~12월 까지 날짜수 데이터
        if(year%4==0){
            monthDays[1]=monthDays[1]+1; //4년마다 윤년이므로 2월을 29일로 만들어줌
        } else {}
        return monthDays;
    }
    public static int getIniDay(int year, int month) {//1일이 시작하는 요일 생성    
        int firstDay = 0;
        int weekDays = 0;
        int iniDay = 0;
        if (year==1){
            iniDay=firstDay;
        } else{
            weekDays=(year-1)/4;
            iniDay=(weekDays+year-1)%7;//7로 나눈 나머지를 1일의 시작 요일로 사용
        }
        int[] monthDays=getMonthdata(year);
        for (int i = 1; i<month; i++){//달력 만들 직전 월 까지 합산
            if (i==month){} else {iniDay=(iniDay+monthDays[i-1])%7;}
        }
        return iniDay; //시작요일 위치 반환
    }
    public static void getMonCal(int year, int month) {//월별 달력 생성
        int iniDay = getIniDay(year,month);//시작요일(0==일요일~6==토요일)
        int[] monthDays = getMonthdata(year);//월별 날짜수를 가져옴
        int[][] calendar = new int[6][7];//달력베이스 6*7 배렬로 생성
        for (int i = 0; i< monthDays[month-1]; i++){//해당월의 날짜를 시작요일에 맞춰 배열에 넣기
            int a = (iniDay+i)/7;//시작요일+날짜를 7로 나눈 몫을 배열의 세로좌표로 사용
            int b = (i+iniDay)%7;//시작요일+날짜를 7로 나눈 나머지를 배열의 가로좌표로 사용
            calendar[a][b] = i+1;
            }
        System.out.println("\t\t    "+year+" 년 "+month + " 월\n"+"\n일\t월\t화\t수\t목\t금\t토"); //달력의 헤더
        for (int e[] : calendar) {
             for (int f : e) {
                 if (f==0){System.out.print("\t");
                 } else { System.out.printf("%2d \t",f);//정렬 사용한 출력
                        }
             }
            System.out.print("\n");
        }
    }
    public static void calYears(int year) {
        for (int i = 1; i<13; i++){getMonCal(year,i);}
    }
    public static void main(String[] args) {//main 에서 달력 호출
        calYears(2020); // 년 단위 단력 한번에 호출 //getMonCal(2020,11); //월별 호출시
    }
}