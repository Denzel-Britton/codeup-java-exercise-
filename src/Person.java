

//Create Person class inside of src that has a private name field that is a string, and the following methods:
public class Person {
    private String name;  // field that is private

    public Person(String name) {
        this.name = name;
    }


    public String getName(){
//TODO: return the person's name
        return  name;

    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;

    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("hello " + name);


    }






    public static void main(String[] args) {
        Person personOne = new Person("denzel"); //  constructor
        personOne.setName("kobe");
        System.out.println(personOne.getName());

//        System.out.println(personOne.getName());
//        personOne.setName("denzel");
//        personOne.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}
