import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getid() {
        return id;
    }
}
class College {
    private String CollegeName;
    private List<Student> students;

    College(String collegeName) {
        this.CollegeName = collegeName;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }
    public String getCollegename() {
        return CollegeName;
    }
    public void printAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student student  = students.get(i);
            System.out.println("College name: "+CollegeName+"\n"+"Student name: "+student.getName()+"\n"+"id: "+student.getid());
        }
    }
}

public class OnetoMany {
    public static void main(String[] args) {
        Student s1 = new Student("Pranabesh Basu", "1");
        Student s2 = new Student("Pritam Karak", "2");
        College c = new College("UEMK");
        c.addStudent(s1);
        c.addStudent(s2);
        c.printAllStudents();
    }
}
