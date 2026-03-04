class Bank{
    private String name;
    private double balance;
    Bank(String n, double b) {
        this.name = n;
        this.balance = b;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public double getBalance(double b) {
        return balance;
    }
}
class GetterSetter {
    public static void main(String[] args) {
        Bank obj1 = new Bank("Pranabesh", 10000);
        obj1.setName("lakku");
        System.out.println(obj1.getName());
    }
}
