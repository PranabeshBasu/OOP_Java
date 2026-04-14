class BankAcc {
    static int count = 0; //Static variable
    // int count = 0;
    String name;
    double balance;
    BankAcc(String name, double balance) {
        this.name = name;
        this.balance = balance;
        count++;
    }
    public int getCount() {
        return count;
    }
    public String getName() {
        return name;
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc("Pranabesh", 1000);
        System.out.println(b1.getName());
        System.out.println(b1.getCount());
        BankAcc b2 = new BankAcc("Manabesh", 2000);
        System.out.println(b2.getName());
        System.out.println(b2.getCount());

    }
}