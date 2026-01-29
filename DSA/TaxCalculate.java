import java.util.Scanner;
public class TaxCalculate {
  static void TaxCalculator(double income) {
     double Tax;
     if(income < 500000) {
        Tax = 0;
     } else if(income >= 500000 && income <= 1000000) {
        Tax =  income * 0.2;
     } else {
             Tax =income * 0.3;
     }
     System.out.println("income Tax =" +Tax);
 }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a income = ");
    double income=sc.nextInt();
     TaxCalculator(income);
   sc.close() ;
}
}