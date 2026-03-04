class BankDetails {
    String name;
    double balance;
    BankDetails(String n, double b) { // Parameterized Constructor
        this.name = n;
        this.balance = b;
    }
    /*
    CONSTRUCTOR OVERLOADING
    */
    BankDetails(String n) {
        this.name = n;
    }
    BankDetails(double b) {
        this.balance = b;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

}
public class ParamConstructor {
    public static void main(String[] args) {
        BankDetails acc1 = new BankDetails("Pranabesh", 20000);
        System.out.println(acc1.getName()+","+acc1.getBalance());
        BankDetails acc2 = new BankDetails("Manabesh");
        System.out.println(acc2.getName()+","+acc2.getBalance());
    }
}

