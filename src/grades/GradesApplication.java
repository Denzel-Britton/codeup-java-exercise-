
package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();

        Student Tom = new Student("Tom", new ArrayList<>());
        Tom.addGrade(80);
        Tom.addGrade(90);
        Tom.addGrade(75);
        Tom.addGrade(30);
        students.put("Tom", "Tomthecat");


        Student Kane = new Student("Kane", new ArrayList<>());
        Kane.addGrade(40);
        Kane.addGrade(60);
        Kane.addGrade(95);
        Kane.addGrade(30);
        students.put("Kane", "Kane10130");
//

        Student Mike = new Student("Mike", new ArrayList<>());
        Mike.addGrade(70);
        Mike.addGrade(40);
        Mike.addGrade(35);
        Mike.addGrade(30);
        students.put("Mike", "MikeLarry23");

        Student Ray = new Student("Ray", new ArrayList<>());
        Ray.addGrade(80);
        Ray.addGrade(90);
        Ray.addGrade(75);
        Ray.addGrade(30);
        students.put("Ray", "RaySmith&");


//        System.out.println(students.keySet());
        boolean keepSearching = true;

        do {

            for (String key : students.keySet()) {
                System.out.printf("|" + key + "|  " );
            }


            System.out.printf("%nWhat student you will like to see more information about? %n ");

            Scanner scanner = new Scanner(System.in);
            String userSearch = scanner.nextLine();
//            kane, mike, ray

            if (userSearch.equalsIgnoreCase( "Tom")){
                System.out.println("Name: " + Tom.getName() + ", Github Username: " + students.get("Tom") + "\nGrade Average: " + Tom.getGradeAverage());
            }else if (userSearch.equalsIgnoreCase( "Mike")){
                System.out.println("Name: " + Mike.getName() + ", Github Username: " + students.get("Mike") + "\nGrade Average: " + Mike.getGradeAverage());
            }else if (userSearch.equalsIgnoreCase( "Ray")) {
                System.out.println("Name: " + Ray.getName() + ", Github Username: " + students.get("Ray") + "\nGrade Average: " + Ray.getGradeAverage());
            }
            else if (userSearch.equalsIgnoreCase( "Kane")) {
            System.out.println("Name: " + Kane.getName() + ", Github Username: " + students.get("Ray") + "\nGrade Average: " + Kane.getGradeAverage());
        }
            else{
                System.out.println("No students with the  username of " + userSearch + " were found.");
            }
            System.out.println("Would you like to search again?");
            String letsContinue = scanner.nextLine();
            if(letsContinue.contains("n")||letsContinue.contains("N")){
                System.out.println("Goodbye!");
                keepSearching = false;
                break;
            }
        }while(keepSearching);





    }
}

