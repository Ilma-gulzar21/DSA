import java.util.Scanner;
class checkPalindrome {
    int reverse;
    int temp;
    int num;
    checkPalindrome() {
        reverse = 0;
    }
    public  boolean ispalindrome(int num) {
     temp = num;
     while(temp > 0) {
            int digit = temp % 10;
             reverse = reverse * 10 + digit;
             temp = temp / 10;
        }
       if(num == reverse) {
        return true;
       }
        return false;
    }   
}
class isPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check a palindrome");
        int num = sc.nextInt();
        checkPalindrome p1 = new checkPalindrome();
       System.out.println(p1.ispalindrome(num));
    }
}