package bottle;

public class beersong {

  public static void main(String[] args) {
   int beerNum =99;
   String word ="bottles"; //복수형
   System.out.println(beerNum + " " + word + " of beer on the wall");
   while (beerNum > 0){
    System.out.println(beerNum + " " + word + " of beer on the wall");
     System.out.println(beerNum + " " + word + " of beer.");
     System.out.println("Take one down.");
     System.out.println("Pass it around.");
     beerNum = beerNum -1;
     if (beerNum == 1) {
       word = "bottle"; //단수형 한병남음 여기에 넣어야 다음 루프시 미리 적용되어 있음
     }
     if (beerNum > 0) {
       System.out.println(beerNum + " " + word +  " of beer on the wall");
     } else {
       System.out.println("No more bottles of beer on the wall");
     }
   }
  }
}
