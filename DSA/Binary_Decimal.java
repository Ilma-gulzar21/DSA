import java.util.Scanner;
class   Binary_Decimal{
    static void DecimalToBinary(int binary) {
         int pow=1;
         int decimal = 0;
        while(binary >0) {
            int digit=binary %10;
           decimal=decimal+digit*pow;
           pow=pow*2;
           binary = binary/10;
        }
          System.out.println("Decimal = "+decimal);
      }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Binary Number = ");
    int num=sc.nextInt();
    DecimalToBinary(num); 
    sc.close();

}

}
