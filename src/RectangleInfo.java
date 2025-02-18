import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false;
        do {
            System.out.print("Please enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("You must enter a valid number for width.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Please enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                in.nextLine();
                System.out.println("You must enter a valid number for height.");
            }
        } while (!done);

        double area = 0;
        area = width * height;

        double perimeter = 0;
        perimeter = 2 * (width + height);

        double diagonal = 0;
        diagonal = Math.sqrt((width * width) + (height * height)); // Pythagorean theorem

        System.out.println("\nThe area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}
