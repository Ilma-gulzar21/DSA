class ATM {
    private double balance;

    ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money! Your balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Success! Remaining balance: $" + balance);
        }
    }

    public double showBalance() {
        return balance;
    }
}

public class UseATM {
    public static void main(String[] args) {
        ATM myAccount = new ATM(500);

        try {
            System.out.println("Withdrawing $200...");
            myAccount.withdraw(200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Withdrawing $400...");
            myAccount.withdraw(400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final balance: $" + myAccount.showBalance());
    }
}