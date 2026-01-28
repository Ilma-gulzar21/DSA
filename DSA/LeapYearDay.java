import java.util.Scanner;
public class LeapYearDay {
  static void leapYear(int year) {
    if((year % 4 ==0 && year % 100 != 0) || (year % 400 ==0) ){
      System.out.println(year+ " is leap year");
    } else {
        System.out.println(year+ " is not leap year");
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter a year");
  int year= sc.nextInt();
 leapYear(year);
   sc.close();
  }
    
}
