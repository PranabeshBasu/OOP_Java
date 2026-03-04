class StudentDetails {
    int roll;
    String name;
    public StudentDetails() {
        System.out.println("This is a default constructor");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        StudentDetails obj1 = new StudentDetails();
    }
}
