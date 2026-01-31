import java.util.Scanner;
public class printDetails {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       System.out.println("<--Enter Student Address Details--> ");
       System.out.print("Enter Student House Number = ");
       String house_no = sc.nextLine();

      System.out.print("Enter Student House Name = ");
       String house_name = sc.nextLine();
       
       System.out.print("Enter Student Street Name =  ");
       String street_name = sc.nextLine();
       
       System.out.print("Enter Student City Name = ");
       String city_name = sc.nextLine();
       
       System.out.print("Enter Student State Name = ");
       String state_name = sc.nextLine();

       System.out.print("Enter Student Pincode = ");
       int pincode = sc.nextInt();
       
       System.out.println("--Student Details & Address -- ");
       System.out.println("Student House Number = " +house_no);
       System.out.println("Student House Name = " +house_name);
       System.out.println("Street Name = " +street_name);
       System.out.println("City Name = " +city_name);
       System.out.println("Pincode = " +pincode);
       System.out.println("State name = " +state_name);
       sc.close();
    }
    

}
