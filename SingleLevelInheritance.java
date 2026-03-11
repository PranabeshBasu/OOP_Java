class School {
    private String name;
    School() {
        name = "DPS";
    }
    public void displaySchoolName() {
        System.out.println("School name is : "+name);
    }
}
class Student extends School {
    private String sname;
    Student(String sname) {
        this.sname = sname;
    }
    public void displayStudentDetails() {
        System.out.println("Student name : "+sname);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Pranabesh Basu");
        s1.displaySchoolName();
        s1.displayStudentDetails();
    }
}
