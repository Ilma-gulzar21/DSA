import java.util.Scanner;
class  BinomialCofficient {
    static int factorial(int n) {
         int fact=1;
    for(int i=1;i<=n;i++) {
        fact=fact*i;
    }
     return fact;
    }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("Enter the value of r");
    int r =sc.nextInt();
    int BC = factorial(n)/(factorial(r) * factorial(n-r));
    System.out.println("Binomial cofficient = " +BC);
    sc.close();
}
}