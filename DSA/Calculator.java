import java.util.Scanner;
public class    Calculator {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      double result=0;
      System.out.print("Enter first Number = ");
      double a=sc.nextDouble();

      System.out.print("Enter  any arithematic operator = ");
      char op=sc.next().charAt(0);

      System.out.print("Enter second number = ");
      double b=sc.nextDouble();
      switch(op) {
        case '+': result=a + b;
        break;
        case '-': result=a - b;
        break;
        case '*': result=a * b;
        break;
        case'/' : if(b != 0) result=a/b;
        break;
        default: System.out.println("you entered wrong number");
     }
     System.out.println("result = " + result);
    sc.close();

}
}