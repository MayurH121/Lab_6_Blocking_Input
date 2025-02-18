import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempInCelsius = 0;
        double tempInFahrenheit = 0;
        String trash = "";
        boolean done = false;
        String continueInput = "";
        do {
            System.out.print("Please enter the temperature in Celsius: ");
            if (in.hasNextDouble())
            {
               tempInCelsius = in.nextDouble();
               in.nextLine();
               done = true;
               tempInFahrenheit = (tempInCelsius * 9/5) + 32;
                System.out.println("The converted temperature in Fahrenheit is: " +tempInFahrenheit);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid Celsius temperature and not " +trash);
            }
            System.out.println("Do you want to convert another temperature? (Y/N)");
            continueInput = in.nextLine().toUpperCase();
        } while (continueInput.equals("Y"));
    }
}