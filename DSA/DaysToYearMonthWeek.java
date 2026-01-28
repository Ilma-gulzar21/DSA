import java.util.Scanner;
public class DaysToYearMonthWeek {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int remainingDays;

    System.out.print("Enter number of Days = ");
    int days = sc.nextInt();

    int years = days/365;
    remainingDays = days % 365;

    int months = remainingDays/30;
    remainingDays = remainingDays % 30;

    int weeks = remainingDays / 7;
    remainingDays = remainingDays % 7;

    System.out.println("years = "+years);
    System.out.println("months = "+months);
    System.out.println("weeks = "+weeks);
    System.out.println("Remaining Days = "+remainingDays);
    sc.close();

}
}

