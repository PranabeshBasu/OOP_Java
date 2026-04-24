// Deep Cloning in Java

class Passport1 implements Cloneable {
    String passportNo;
    Passport1(String p) {
        this.passportNo = p;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student1 implements Cloneable{
    String name;
    Passport1 passport;
    Student1(String n, Passport1 p) {
        this.name = n;
        this.passport = p;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 student = (Student1) super.clone();
        student.passport = (Passport1) passport.clone();
        return student;
    }
}

public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport1 p1 = new Passport1("1132456");
        Student1 s1 = new Student1("Pranabesh", p1);
        Student1 s2 = (Student1) s1.clone();
        System.out.println(s1.name);
        System.out.println(s1.passport.passportNo);
        System.out.println(s2.name);
        System.out.println(s2.passport.passportNo);
        s2.name = "Manabesh";
        s2.passport.passportNo = "1132455";
        System.out.println(s1.name);
        System.out.println(s1.passport.passportNo);
        System.out.println(s2.name);
        System.out.println(s2.passport.passportNo);
    
    }
}
