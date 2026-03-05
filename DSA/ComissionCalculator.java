import java.util.Scanner;
class findcommission {
    private double commission;
    private int sales;
      findcommission() {
        sales = 0;
    }
    public void comissionCheck(int sales) {
       if(sales < 0) {
        System.out.println("Sales cannot be negative");
       } else if(sales <500) {
          commission = (double)(2*sales/100);
          System.out.println("Commission = "+commission);
       } else if(sales < 5000) {
           commission = (double)(5*sales/100);
          System.out.println("Commission = "+commission);
       } else {
           commission = (double)(8*sales/100);
          System.out.println("Commission = "+commission);
       }
    } }
class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sale");
        int sale = sc.nextInt();
        findcommission calculate = new findcommission();
         calculate.comissionCheck(sale);
         sc.close();
    }
}