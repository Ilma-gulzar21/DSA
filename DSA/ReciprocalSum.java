import java.util.Scanner;
class reciprocal {
private double sum;
private double num;

  public reciprocal() {
    sum = 0.0;
  }
  
public double sumReciprocal(int n) {
 System.out.println("Computes the sum of the reciprocals");
  for(int i=1;i<=n;i++) {
    num = 1.0/i;
    System.out.println("1 divided b " +i+ " = " +num);
         sum = sum + num;
  }
  return sum;
}

void calculateReciprocal(int n) {
  System.out.println("sum of the reciprocals from 1 to "+n+ " = "  +sum);
}
}
class ReciprocalSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     reciprocal reciprocalSum = new  reciprocal();
    System.out.print("Enter the value of n = ");
    int n = sc.nextInt();
      reciprocalSum.sumReciprocal(n);
    reciprocalSum.calculateReciprocal(n);
    sc.close();
  }
}
