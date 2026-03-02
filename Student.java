import java.util.*;
class StudentDetails {
    int rollNumber;
    String name;
    public void SetDetails(int roll, String n) {
        rollNumber = roll;
        name = n;
    }
    public void displayDetails() {
        System.out.println("Name : "+name+"\n"+"Roll Number : "+rollNumber);
    }
}
public class Student {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.SetDetails(1, "Pranabesh Basu");
        s1.displayDetails();
    }
}