import java.util.Arrays;

public class ArraysExercises {


///Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] newPeople, Person newName) {
        Person[] newArray = Arrays.copyOf(newPeople, newPeople.length + 1);
        newArray[newPeople.length] = newName;
        return newArray;
    }

    public static void main(String[] args) {

        Person[] persons = {new Person("Terry"), new Person("Kim"), new Person("Jack")};
//        for (Person getperson : persons) {
//            System.out.println(getperson.getName());
//        }
            Person[] newPersonToby = addPerson(persons, new Person("toby"));
            for (Person add : newPersonToby) {
                System.out.println(add.getName()); // uses getname method cause name is person
            }


        }
    }
//}
