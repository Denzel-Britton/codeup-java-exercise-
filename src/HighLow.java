import java.lang.Math;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        game();

    }


    public static void game() {
        Scanner scanner = new Scanner(System.in);
        // define the range
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 100
        for (int i = 0; i <= 0; i++) {
            int rand = (int) (Math.random() * range) + min;

            // Output is different everytime this code is executed
            System.out.println(rand);
            while (true){
                System.out.println("guess the number 1 - 100 : ");
                int userInput = scanner.nextInt();  // if it doesn't meet the if else  it returns the
                if (userInput < rand) {
                    System.out.println("Higher");
                } else if (userInput > rand) {
                    System.out.println("Lower");
                } else if (userInput == rand) {
                    System.out.println("Congrats");
                    break;
                }

            } ;


        }
    }
}


//    Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.