import java.util.Scanner;
public class UsePrebuiltFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("\n--- Uses of Math Class Methods ---\n");
        System.out.println("Math.abs(num): " + Math.abs(num));
  if(num<0) {
          System.out.println("Math.sqrt(num): " + Math.sqrt(-num));
  } else {
          System.out.println("Math.sqrt(num): " + Math.sqrt(num));
  }
        System.out.println("Math.pow(num, num2): " + Math.pow(num,2));
        System.out.println("Math.sin(num): " + Math.sin(num));
        System.out.println("Math.cos(num): " + Math.cos(num));
        scanner.close();
    }
}