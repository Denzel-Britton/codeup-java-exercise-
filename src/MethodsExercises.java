import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
//        int addSum = addition(8, 3);
//        System.out.println(addSum);
//
//        int subSum = Subtraction(8, 5);
//        System.out.println(subSum);
//
//        int mulSum = Multiplication(5, 5);
//        System.out.println(mulSum);
//
//        int divSum = Division(60, 2);
//        System.out.println(divSum);
//        int modSum = Mod(2, 4);
//        System.out.println(modSum);
//
        System.out.println(getInteger(6,8,""));

//
//
        factorial();

        rollDice();


    }

//    public static int addition(int a, int b) {
//        return a + b;
//
//    }
//
//    public static int Subtraction(int c, int d) {
//        return c - d;
//    }
//
//    public static int Multiplication(int e, int f) {
//        return e * f;
//    }
//
//    public static int Division(int g, int h) {
//        return g / h;
//
//    }
//
//    public static int Mod(int i, int j) {
//        return i % j;
//
//    }
//
public static String tryAgain() {
    System.out.println("Sorry number was not in range try again");
    return "";
}


    public static int getInteger(int min, int max, String  sorry) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int userInput1 = scanner.nextInt();

            if (userInput1 >= min && userInput1 <= max) {
                System.out.println("Congrats your in range");
                return userInput1;
            }
                return  getInteger(min, max, tryAgain());

    }

//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            long userNum = scanner.nextInt();
            long fac = 1;
            for (long i = 1; i <= userNum; ++i) {
                // factorial = factorial * i; this the condition and i increments and factorial
                //
                fac *= i;

            }
            System.out.printf("Factorial of %d = %d %n", userNum, fac);
            System.out.println("Do you want to continue? (y/n):");
            choice = scanner.next();

        } while (!choice.equalsIgnoreCase("n"));


    }
    //    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        String roll;
        System.out.println("enter the number of sides for a pair of dice: ");
        int userInput = scanner.nextInt();
        System.out.println("you Rolled the  dice: " + userInput +"times");



            int dice1=(int)(Math.random()*6*1);
            int dice2=(int)(Math.random()*6+1);
            int sum = dice1 + dice2;

            System.out.println("Dice 1" + dice1);
            System.out.println("Dice 2" + dice2);
            System.out.println();



            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)

    }
}









