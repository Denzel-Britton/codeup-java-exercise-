import java.util.Arrays;
import java.util.Scanner; // library import form java

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in); // use to grab user input
//        int number; // define the variable
        String firstWord;
        String secondWord;
        String thirdWord;


//        System.out.print(" Please Choose a number: ");
//        number = scanner.nextInt(); //the next line
//        System.out.println("Your number is " +number); // prints user in the input in
//        System.out.print(" Please insert  3 words : ");
//         firstWord = scanner.nextLine();
//         secondWord = scanner.nextLine();
//         thirdWord = scanner.nextLine();
//        System.out.println("Your first word is: " + firstWord);
//        System.out.println("Your second word is: " + secondWord);
//        System.out.println("Your third word is: " + thirdWord);


//        String sentence;
//        System.out.print(" Please insert  a sentence : ");
//        sentence = scanner.nextLine();
//        System.out.println("Your sentence is " + sentence);


//        Scanner scanner = new Scanner(System.in);
//
//        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        String length;
//        String width;
//        System.out.print("please enter length: ");
//        length = scanner.nextLine();
//        System.out.print("please enter width:  ");
//        width = scanner.nextLine();
//        System.out.println("Your length: " + length);
//        System.out.println("Your width: " + width);
//        int parseStringWidth =  parseInt(width);
//        int parseStringLength =  parseInt(length);
//
//
//        System.out.println("parseString = " + parseStringWidth);
//        System.out.println("parseString = " + parseStringLength);
//
//        int area = parseStringLength * parseStringLength;
//        int perimeter = (parseStringLength * 2 ) * (parseStringWidth * 2);
//        System.out.println("the area: " + area );
//        System.out.println("the perimeter: " + perimeter );
        // bonus
        int length;
        int width;
        int height;
        System.out.print("please enter length: ");
        length = scanner.nextInt();
        System.out.print("please enter width:  ");
        width = scanner.nextInt();
        System.out.print("please enter height: ");
        height = scanner.nextInt();
        System.out.println("Your length: " + height);


        int area = length * width;
        int perimeter = (length * 2 ) * (width * 2);
        int volume = length * width * height;
        System.out.println("the area: " + area );
        System.out.println("the perimeter: " + perimeter );
        System.out.println("the volume: " + volume);



    }
}

