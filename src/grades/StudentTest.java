package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        Student toby = new Student("toby",new ArrayList<>());
        toby.addGrade(80);
        toby.addGrade(90);
        toby.addGrade(75);
        toby.addGrade(30);
        System.out.println(toby.getGrades());
        System.out.println(toby.getGradeAverage());



    }
}
