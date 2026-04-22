class Company {
    private String CompanyName;
    Company(String Cname) {
        this.CompanyName = Cname;
    }
    public String getCname() {
        return CompanyName;
    }
}
class Employee {
    private String Ename;
    private Company company;
    Employee(String name, String Cname) {
        this.Ename = name;
        this.company = new Company(Cname);
    }
    public String getEname() {
        return Ename;
    }
    public void displayEmployment() {
        System.out.println("Emaployee name: "+Ename);
        System.out.println("Company name: "+company.getCname());
    }
}

public class Composition {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pranabesh Basu", "TCS");
        e1.displayEmployment();
    }
}