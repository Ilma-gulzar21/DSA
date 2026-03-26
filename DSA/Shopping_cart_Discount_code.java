import java.util.Scanner;
class invalidCodeException extends Exception{
    invalidCodeException(String msg) {
        super(msg);
    }
}

class applyCart {
    private double price;
    String code = "ilma123"; //Discount for 20%

    applyCart(double price) {
        this.price = price;
    }

    public void ApplyCode(String newCode) throws invalidCodeException{
      if(newCode.equalsIgnoreCase(this.code)) {
           price = price - price * 0.2;
           System.out.print("Price After Applied a Discount Code = "+price);
      } else {
        throw new invalidCodeException("Your Discount Code "+"'"+newCode+"'"+" is invalid");
       }
    }
}
class Shopping_cart_Discount_code {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter original Price = ");
    double price = sc.nextDouble();
    sc.nextLine();
    System.out.print("Enter your Discount Code = ");
    String Code = sc.nextLine();

    applyCart user = new applyCart(price);
     try {
       user.ApplyCode(Code);
    } catch(invalidCodeException e) {
       System.out.println(e.getMessage());
    } finally {
         sc.close();
    }
}
}