import java.util.Scanner;
class fibonacci {
    private int a;
    private int b;
    private int i;
   public fibonacci() {
    a=0;
    b=1;
    i=1;
   }
   public void FibonacciSeries(int n) {
    do {
         System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
    } while (i <=n);
   }
}
class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        fibonacci printSeries = new fibonacci();
        System.out.print("Enter the value of n to print fibonacci Series");
        int n = sc.nextInt();
        System.out.println(" first "+n+" Fibonacci Series:");
        printSeries.FibonacciSeries(n);
       sc.close();
    }
}