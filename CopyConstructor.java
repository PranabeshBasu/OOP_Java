class StudentData {
    int roll;
    String name;
    StudentData(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    StudentData(StudentData s1) {
        // this.roll = s1.roll;
        // this.name = s1.name;
        this(s1.roll,s1.name); //Calling the constructor
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        StudentData obj1 = new StudentData(1, "Pranabesh Basu");
        StudentData obj2 = new StudentData(obj1);
        System.out.println(obj2.roll+"-"+obj2.name);
    }
}
