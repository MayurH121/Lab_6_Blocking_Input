import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;  // val is 1 to 10

        int userGuess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();

                if (userGuess >= 1 && userGuess <= 10) {   //numbers should be between 1 and 10 inclusive
                    done = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                in.nextLine();
                System.out.println("You must enter a valid integer.");
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess is on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is low. Try again!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess is high. Try again!");
        }
    }
}
