import java.util.Scanner;
class  CountNumberOfDigits {
    static void DigitsOp(int num) {
        int sum=0;
        int count = 0;
        int reverse=0;
        while(num>0) {
            int digit=num %10;
            sum=sum+digit;
            count++;
            reverse =reverse * 10 + digit;
            num = num/10;
        }
        System.out.println("Sum of Digits "+sum);
        System.out.println("Count of Digits "+count);
        System.out.println("reverse of Digits " +reverse);


    }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of num");
    int num=sc.nextInt();
    DigitsOp(num);
   
    sc.close();
}
}