import java.util.ArrayList;
import java.util.List;

class Students {
    private String sname;
    private List<Courses> courses;
    Students(String name) {
        this.sname = name;
        courses = new ArrayList<>();
    }
    public String getSname() {
        return sname;
    }
    public void addCourses(Courses c) {
        courses.add(c);
    }
    public void displayCourses() {
        for (int i = 0; i < courses.size(); i++) {
            Courses c = courses.get(i);
            System.out.println("Course Name: "+c.getCname());
        }
    }

}

class Courses {
    private String cname;
    private List<Students> students;
    Courses(String name) {
        this.cname = name;
        students = new ArrayList<>();
    }
    public String getCname() {
        return cname;
    }
    public void addStudents(Students s) {
        students.add(s);
    }
    public void displayStudents() {
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
            System.out.println("Student name: "+s.getSname());
        }
    }
}

public class ManytoMany {
    public static void main(String[] args) {

        Courses c1 = new Courses("CSE");
        Courses c2 = new Courses("CSE(AI & ML)");

        Students s1 = new Students("Pranabesh");
        Students s2 = new Students("Pritam");
        Students s3 = new Students("Rajbir");

        s1.addCourses(c1);
        s1.addCourses(c2);
        c1.addStudents(s1);
        c2.addStudents(s1);

        s2.addCourses(c2);
        c2.addStudents(s2);

        s3.addCourses(c1);
        c1.addStudents(s3);

        System.out.println("Student details of course1");
        c1.displayStudents();
        System.out.println("Student details of course2");
        c2.displayStudents();

        System.out.println("course details of s1");
        s1.displayCourses();
        System.out.println("course details of s2");
        s2.displayCourses();
        System.out.println("course details of s3");
        s3.displayCourses();

    }
}
