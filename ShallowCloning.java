
// SHALLOW CLONING IN JAVA

class Passport {
    String passportNo;
    Passport(String p) {
        this.passportNo = p;
    }
}
class Student implements Cloneable{
    String name;
    Passport passport;
    Student(String n, Passport p) {
        this.name = n;
        this.passport = p;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Passport p = new Passport("1314342526");
        Student s1 = new Student("Pranabesh", p);
        Student cloned_Student = (Student) s1.clone();
        System.out.println(s1.name);
        System.out.println(s1.passport.passportNo);
        System.out.println(cloned_Student.name);
        System.out.println(cloned_Student.passport.passportNo);
        cloned_Student.passport.passportNo = "131245";
        System.out.println(s1.passport.passportNo);
        System.out.println(cloned_Student.passport.passportNo);
    }
}