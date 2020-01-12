package BiG;

import java.util.Scanner;


public class GaSung {

  public static void main(String[] args) {
   int Num;
   Scanner scan = new Scanner(System.in);
   System.out.println("비교 대상 수를 입력하세요.");
   Num = scan.nextInt();
   System.out.println("제품 정보를 입력합니다.");
   int[] Nums;
   int coun = Num;
   String[] n = new String[coun];
   double[] p = new double[coun];
   double[] v = new double[coun];
   double[] GS;
   for(int i=1; i<=coun; i++){
    Product Pro = new Product();
    System.out.println("상품명을 입력하세요.");
    Pro.Nam = scan.next();
    System.out.println("단위량을 입력하세요.");
    Pro.Vol = scan.nextDouble();
    System.out.println("가격을 입력하세요.");
    Pro.Price = scan.nextDouble();
    Pro.calculation();
    n[i - 1] = Pro.Nam;
    p[i - 1] = Pro.Price;
    v[i - 1] = Pro.Vol;
   }
   for(int j=1; j<=coun; j++){
    System.out.println(n[j-1]);
    System.out.println(p[j-1]);
    System.out.println(v[j-1]);
   }
   
  }
}
