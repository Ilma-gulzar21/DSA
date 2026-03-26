import java.util.Scanner;
class NotEnoughMoney extends Exception{
NotEnoughMoney(String msg){
    super(msg);
}
}

class WithdrawMoney {
    private double balance; 
    
    WithdrawMoney(double TotalAmount) {
        this.balance = TotalAmount;
    }

    public void WithdrawProcessing(double Amount) throws NotEnoughMoney {
        if(Amount > balance) {
            throw new NotEnoughMoney("Not Enough Money! Your balance is "+ balance);
        } else {
            balance -= Amount;
            System.out.println("success! Remaining balance "+balance);
        }
    }
}
class ATM_custom_exception {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Total Amount in Account = ");
    double TotalAmount = sc.nextDouble();

    System.out.print("Enter the Amount to withdraw an ATM  = ");
    double Amount = sc.nextDouble();

    WithdrawMoney money = new WithdrawMoney(TotalAmount);
    try {
        money.WithdrawProcessing(Amount);
    } catch(NotEnoughMoney e) {
       System.out.println(e.getMessage());
    } finally {
         sc.close();
    }
   
}
}