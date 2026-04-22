class Passport {
    private String passportNumber;

    Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
class Student {
    private String name;
    //Student class has one to one relationship with the object of Passport class
    private Passport passport;
    Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }
    public void displayDetails() {
        System.out.println("Name of the student is: "+name);
        System.out.println("The passport number is: "+passport.getPassportNumber());
    }
}
public class OnetoOne {
    public static void main(String[] args) {
        // This is the example of Aggregation as well
        Passport p1 = new Passport("1131562725724");
        Student s1 = new Student("Pranabesh Basu", p1);
        s1.displayDetails();
    }
}
