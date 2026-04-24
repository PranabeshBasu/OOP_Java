class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
        System.out.println("Custom Exception is executed!");
    }
}

class Bank {
    String name;
    double amount;
    Bank(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    public void addBalance(double val) {
        amount += val;
    }
    public void withdrawBalance(double val) throws InsufficientBalanceException {
        if (val > amount) {
            throw new InsufficientBalanceException("Account with insufficient balance can not be withdrawn!");
        }
        amount -= val;
        System.out.println("Account Withdrawn succesful!");
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        Bank b1 = new Bank("Pranabesh", 1000);
        b1.addBalance(200);
        try {
            b1.withdrawBalance(1100);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}