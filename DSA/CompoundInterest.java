import java.util.Scanner;
public class CompoundInterest {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double CompoundInterest;
    System.out.print("Enter initial amount = ");
    double p = sc.nextDouble();
    System.out.print("Enter Rate of interest = ");
    double r = sc.nextDouble();
    System.out.print("Enter Time in years = ");
    int t = sc.nextInt();
    double finalAmount = p*Math.pow(1+r/100,t);
    System.out.println("<--compound Interest-->");
    CompoundInterest = finalAmount-p;
    System.out.println("Compound interest = "+CompoundInterest);
    sc.close();

}
}