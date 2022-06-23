package score;


import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student one = new Student("小咪", 78, 62);
        Student two= new Student("噢給", 60, 30);
        GraduateStudent three =
                new GraduateStudent("呵呵", 65, 82, 79);
        one.print();
        two.print();
        three.print();
        /*List<Student> students = new ArrayList<>();
        students.add(jack);
        students.add(hank);
        students.add(jane);
        for (int i=0; i<students.size(); i++) {
            Student stu = students.get(i);
            stu.print();
        }*/
    }
}