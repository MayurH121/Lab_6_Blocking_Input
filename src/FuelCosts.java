import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double fuelEfficiency = 0;
        double priceOfGas = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Please enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                gasInTank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid amount of gas in the tank and not " +trash);
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Please enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid fuel efficiency and not " +trash);
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Please enter the price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                priceOfGas = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid price of gas and not " +trash);
            }
        } while (!done);
        double costToDriveHundredMiles = 0;
        costToDriveHundredMiles = (100 / fuelEfficiency) * priceOfGas;
        System.out.println("Based on the information you provided,the cost to drive 100 miles is: " +costToDriveHundredMiles);
        double distanceWithFullTank = 0;
        distanceWithFullTank = gasInTank * fuelEfficiency;
        System.out.println("Based on the information you provided, the car can go " + distanceWithFullTank + " miles with a full tank of gas.");
    }
}
