public class PracticeClass {

    int x = 2; // what the class knows // static
    public String name; // instance field
    public String cohort; // instance field

    private double grade;  // private

    void printHi() { // method
        System.out.println("HI");
    }

    public PracticeClass() {// constructor
        System.out.println("new person created");
    }

//    public PracticeClass(String Studentname) {  // setting constructor with 1 parameter
//        name = Studentname; //my instance will = my parameter Studentname
//        cohort = " dont know "; //giving it value  with no parameter
//    }

//    public PracticeClass(String Studentname, String assignedCohort) { // setting constructor with 2 parameter
//            name = Studentname;  //my instance will = my parameter Studentname
//        cohort = assignedCohort; //my instance will = my parameter assignedCohort
//
//    }

//    public String getInfo() { // method
//        return String.format("name: %s, cohort: %s", name, cohort);
//    }




    //"this keyword"
    public PracticeClass(String name) {  // setting constructor with 1 parameter
        this.name = name; //my instance will = my parameter Studentname
        cohort = " dont know "; //giving it value  with no parameter
    }

    public PracticeClass(String name, String cohort) { // setting constructor with 2 parameter
        this.name = name;  //my instance will = my parameter Studentname
        this.cohort = cohort; //my instance will = my parameter assignedCohort

    }
    public String sayHello() {
        return "Hello " + this.name + "!" + "Welcome to the:"+ this.cohort;
    }

 ///// creating a another constuctor
public PracticeClass (String name, double grade){
        this.name =name;
        this.grade = grade;
}



    public double showGrade() {  /// make a method to return the private to public using a method
        return  grade;
    }
}



