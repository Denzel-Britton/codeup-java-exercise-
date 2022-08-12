public class PracticeMain {

    public static void main(String[] args) {
PracticeClass n = new PracticeClass();  // creating new objects form  class
PracticeClass l = new PracticeClass(); // you can have multiple objects from a class
        System.out.println(n.x);
        System.out.println(l.x);
      n.printHi(); // it can also call a method


        PracticeClass p = new PracticeClass();
        p.name = "Larry";
        System.out.println(p.name);

       PracticeClass e1 = new PracticeClass(); // constructors come after the "new" keyword.
       PracticeClass e2 = new PracticeClass(); //constructors  building something new

        PracticeClass s1 = new PracticeClass("a"); // constructors  with one parameter
        PracticeClass s2= new PracticeClass("b","the War"); // constructors with 2 parameters
//        System.out.println(s1.getInfo());  // printing the constructor and calling  getInfo method to format it
//        System.out.println(s2.getInfo()); // printing the constructor and calling  getInfo method to format it
        System.out.println(s1.sayHello());  // printing the constructor and calling  getInfo method to format it
        System.out.println(s2.sayHello()); // printing the constructor and calling  getInfo method to format it




        // private instance method with new constructor

        PracticeClass studnetGrade = new PracticeClass("Corey",48.78);
        System.out.println("hello " + studnetGrade.name + " this is your grade:" + studnetGrade.showGrade());


    }
}
