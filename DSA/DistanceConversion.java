import java.util.Scanner;
public class DistanceConversion {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Distance in kilometer = ");
    double kilometer = sc.nextDouble();
     double meters = kilometer*1000;
     double centimeter=kilometer*100000;
     double milimeter =kilometer*1000000;

      System.out.println("meters = "+ meters);
      System.out.println("centimeters = "+ centimeter);
      System.out.println("milimeters = "+  milimeter );
    sc.close();
}
}