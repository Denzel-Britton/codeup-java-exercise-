//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        for (int i = 0; i <=15; i++) {
//            System.out.println("i is " + i);
//        }
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//
//            i-=5;
//        } while (i > -11 );
//        for (int i = 100; i > -11 ; i -=5) {
//            System.out.println("i is " + i);
//        }
//
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        long i = 2; // use long data type when to hold large  values like 1mil in the example
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
//        for (long i = 2; i < 1000000;  i *= i) {
//            System.out.println(i);
//        }
//    }
//}
///////// exercise 1b
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        long i = 2; // use long data type when to hold large  values like 1mil in the example
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
//        for (long i = 2; i < 1000000;  i *= i) {
//            System.out.println(i);
//        }
//    }
//}
///////// exercise 2  fizbuzz
//Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz " +i);
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz " +i);
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz " + i);
//
//            }
//        }
//    }
//}
///////// exercise 3
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert a number:  ");
//        int userNum = scanner.nextInt();
//
//        String number = "number |";
//        String squared = " squared |";
//        String cubed = " cubed";
//        System.out.format(number + squared + cubed, "\n");
//        String c1 = "------ |";
//        String c2 = "-------- |";
//        String c3 = "------ ";
//        int squaredNum = userNum * userNum;
//        int cubedNum = userNum * userNum * userNum;
//        System.out.format("\n" + c1);
//        System.out.format(c2);
//        System.out.format(c3);
//
//        for (int i = 1; i < userNum; i++) {
//            int iSquared = i * i;
//            int iCube = i * i * i;
//
//            System.out.printf("%n %s     | %s       | %s ", i, iSquared, iCube);
//        }
//        System.out.printf("%n %s     | %s      | %s", userNum, squaredNum, cubedNum);
//        /// continue where
//        System.out.printf("%n %n Continue? [y/N] ");
//        String userInput = scanner.next();
//
//
//
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        if (confirmation = userInput.equalsIgnoreCase("y")) {
//            for (int i = userNum; i < 100; ++i) {
//                int iSquared = i * i;
//                int iCube = i * i * i;
//
//                System.out.printf("%n %s     | %s       | %s %n", i, iSquared, iCube);
//            }
//
//
//        } else {
//            System.out.printf("Ok see you later %n %n");
//
//        }

        System.out.println("Pick a numerical grade from 0 to 100: ");
        int userPic = scanner.nextInt();

            if (userPic > 101 ) {
                System.out.println("Nice try in only get a 100/100 you still get an A for effort");

            } else if (userPic <= 59) {
                System.out.println("F");
            }else if (userPic <= 66) {
                System.out.println("D");
            }else if (userPic <= 79) {
                System.out.println("C");
            }else if (userPic <= 87) {
                System.out.println("B");
            }else if (userPic >= 88) {
                System.out.println("A");
            }
        System.out.printf("%n %n Continue? [y/N] ");
        String userInput = scanner.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");
        if (confirmation = userInput.equalsIgnoreCase("y")) {
            System.out.println("Grade Ranges:\n" +
                    "\n" +
                    "A : 100 - 88\n" +
                    "B : 87 - 80\n" +
                    "C : 79 - 67\n" +
                    "D : 66 - 60\n" +
                    "F : 59 - 0");
        } else System.out.println("have a nice day");








    }

}
