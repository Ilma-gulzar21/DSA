import java.util.Scanner;
class  ChechPallindrome {
    static void Pallindrome(int num) {
        int reverse=0;
        int original=num;
        while(num>0) {
            int digit=num %10;
            reverse =reverse * 10 + digit;
            num = num/10;
        }
      if(original == reverse)  {
        System.out.println("this is pallindrome");
      } else {
        System.out.println("this is not pallindrome");
      }
    }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of num");
    int num=sc.nextInt();
   Pallindrome(num);
   
    sc.close();
}
}