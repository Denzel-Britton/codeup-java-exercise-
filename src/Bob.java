import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unknown;
        do {
            System.out.println("Say something to Bob: ");
            String userInput = scanner.nextLine();


            if (userInput.contains("?")) {
                System.out.println("Sure");


            } else if (userInput.contains("!")) {
                System.out.println("Whoa");

            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else  {
                System.out.println("Whatever");
            }
            System.out.printf("%n %n Continue? [y/N] ");
            unknown = scanner.nextLine();



        } while(unknown.equalsIgnoreCase("y"));

    }


}
