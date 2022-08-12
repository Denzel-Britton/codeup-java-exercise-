import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

  private static  Random random = new Random();  // so it can be reused

    public static String [] adjectives = {new String("cheerful"),new String("clever"),new String("dark"),new String("depressed"),new String("eager"),new String("evil"),new String("foolish"),new String("jolly"),new String("lucky"),new String("mysterious")};

    public static String [] nouns = {new String("King"), new String("Queen"), new String("Actor"), new String("Pizza"), new String("Hair"), new String("Art"), new String("Basket"), new String("Boss"), new String("Builder"), new String("Camera")};

    public static String  nameBuilder(String [] array1 , String [] array2) {

        System.out.println("Here is your server name: ");
        return array2[random.nextInt(array2.length) ] +"-"+ array1[random.nextInt(array1.length) ];


 // step 1 pick a random index of the adjective array
        //step 2 pick a random index of the nouns array
        // creat a string to concat adjective elements and the nouns element

        //return string



    }






    public static void main(String[] args) {




        System.out.print(nameBuilder(nouns, adjectives));
    }


}



