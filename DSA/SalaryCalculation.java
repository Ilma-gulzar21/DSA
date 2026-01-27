import java.util.Scanner;
public class SalaryCalculation {
  static void salary(double basic_salary) {
   double HRA = basic_salary * 10/100;
   double DA = basic_salary * 5/100;
   double totalSalary = HRA + DA + basic_salary;
   System.out.println("HRA = "+ HRA);
   System.out.println("DA = "+ DA);
   System.out.println("Total salary = " + totalSalary);
  }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter a basic salary = ");
   double basicSalary=sc.nextDouble();
   salary(basicSalary);
   sc.close();
}
}