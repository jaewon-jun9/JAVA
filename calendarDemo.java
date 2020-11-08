public class monthDayDemo {
     public static int[] getMonthdata(int year) { //월별 날짜 수 
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};//1월~12월 까지 날짜수 데이터
        if(year%4==0){
            monthDays[1]=monthDays[1]+1; //4년마다 윤년이므로 2월을 29일로 만들어줌
        } else {}
        return monthDays;
    }
//1일 이 시작하는 요일 생성    
    public static int getIniDay(int year, int month) {
        int weekDays = 0;
        for (int i = 1; i<year; i++){
            if (i%4==0){weekDays = weekDays + 366;} else {weekDays = weekDays + 365;}
        }
        int[] monthDays=getMonthdata(year);
        for (int i = 1; i<month; i++){
            weekDays=weekDays+monthDays[i-1];
        }
        int iniDay=(weekDays)%7;
        return iniDay;
    }
//testcode 1년 1월 기준 달력 생성
    public static void main(String[] args) {
        int year = 1;//연도 지정
        int month = 2;//월 지정
        int iniDay = getIniDay(year, month);//시작요일(0==일요일~6==토요일)
        int[] monthDays = getMonthdata(year);
        int[][] calendar = new int[6][7];
        for (int i = 0; i< monthDays[month-1]; i++){
            int a = (iniDay+i)/7;
            int b = (i+iniDay)%7;
            calendar[a][b] = i;
            }
        System.out.println("\t\t    "+year+" 년 "+month + " 월\n"+"\n일\t월\t화\t수\t목\t금\t토\n"); //달력의 헤더
        for (int e[] : calendar) {
             for (int f : e) {
                 if (f==0){
                     System.out.print("\t");
                 } else {
                 System.out.print(f+"\t");
                 }
                 if (f%7==6){
                 System.out.print("\n");
                 }
             }
        }
    }
}
