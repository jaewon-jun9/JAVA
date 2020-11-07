public class monthDayDemo {
 
    public static int[] getMonthdata() {
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31,31};//1월~다음해1월 까지 날짜수 데이터
        return monthDays;
    }
//월 별 날짜수 출력해 보기
    public static void main(String[] args) {
        int[] monthDays = getMonthdata();
        for (int i = 0; i < monthDays.length-1; i++) {
            int monthDay = monthDays[i];
            System.out.println(i+1 + " 월은 " + monthDay + "일 입니다.");
        }
    }
}
