import java.util.Scanner;
class pattern {
    private int num;

      public pattern() {
        num = 0;
      }

      public void NumberPattern(int n) {
         for(int i = 1; i <= n; i++) {
              for(int j = 1; j <= i; j++) {
                     System.out.print(num + " ");
                          num++;
                 }
            System.out.println();
          }
        }

      public void binaryPattern(int n) {
           for(int i = 1; i <= n; i++) {
              for(int j = 1; j <= i; j++) {
                    if((i + j) % 2 == 0) {
                        System.out.print("1");
                   } else {
                       System.out.print("0");
                }
            }
            System.out.println();
        }
      }
}
class BinaryPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        pattern printPattern = new pattern();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("        --Pattern 1 --        ");
        printPattern.NumberPattern(n);
        System.out.println("        --Pattern 2 --        ");
        printPattern.binaryPattern(n);
        sc.close();
}
}
