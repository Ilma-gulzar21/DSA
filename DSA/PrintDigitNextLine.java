import java.util.Scanner;
class printnum {

     public  void printNumber(int num) {
        int divisor = 1;
        int temp = num;
        while(temp >= 10) {
            temp = temp / 10;
            divisor = divisor * 10;
        }
        temp = num;
        while(divisor > 0) {
            int digit = temp / divisor;
            System.out.println(digit);
             temp = temp % divisor;
           divisor =   divisor / 10;
        }
     }
}

class PrintDigitNextLine {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        printnum printnext = new printnum();

        System.out.println("Enter the Number");
        int num = sc.nextInt();
         printnext.printNumber(num);
         sc.close();
    }
}