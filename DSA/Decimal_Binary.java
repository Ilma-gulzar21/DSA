import java.util.Scanner;
class  Decimal_Binary{
    static void DecimalToBinary(int decimal) {
         int pow=1;
         int binary = 0;
        while(decimal > 0) {
            int rem = decimal % 2;
           binary = binary + rem*pow;
           pow=pow * 10;
           decimal = decimal/2;
        }
          System.out.println("Binary = " +binary);
      }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Decimal Number = ");
    int num=sc.nextInt();
    DecimalToBinary(num); 
    sc.close();
}
}  