import java.util.Scanner;
public class ElectricityBill {
  static void Bill(int unit) {
    int rate=9;
    int electricBill = rate * unit;
    System.out.println("Electric Bill = " +electricBill);
  }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     System.out.print("How many units = ");
     int unit=sc.nextInt();
     Bill(unit);
   sc.close();
}
}