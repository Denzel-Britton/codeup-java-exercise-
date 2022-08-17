package grades;

import java.util.ArrayList;

public class Student {
/// fields
    private String name;
    private ArrayList<Double> grades;

    /// constructor
    public Student(String name, ArrayList<Double> grades) {  //adding an empty array list when you call two make a new object

        this.name = name;

        this.grades = grades;

    }

    // getter to ge the grades
    public ArrayList<Double> getGrades() {
        return grades;
    }


    //  getter  returns the student's name
    public String getName() {

        return name;

    }


    //  method adds the given grade to the grades property
    public void addGrade(double grade) {

        grades.add(grade);



    }


    // returns the average of the students grades

    public double  getGradeAverage() {


        double total = 0;
        for(Double grade: grades){
            total += grade;
        }
         return total/grades.size();
//        int i;
//
//        int length = grades.size();
//
//        int sum = 0;
//
//        for (i = 0; i < grades.size(); i++) {
//
//            sum += grades.get(i);
//
//        }
//
//        double average = sum/length;


    }

}