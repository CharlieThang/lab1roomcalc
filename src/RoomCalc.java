import java.util.Scanner;

/**
 * Created By Charlie Woods
 * 1/30/2017
 * This Utility Calculates The Perimeters Of A Room
 */
public class RoomCalc {
    public static void main(String[] args) {
        //1. Set Up Resources
        Scanner charscan = new Scanner(System.in);


        //2. State Purpose Of Utility
        System.out.println("This Is A Room Area Calculator Utility");

        //3. Request User Input
        String text = "";

        //This Is A "Do Loop", It Allows User To Start Over If Necessary

        do {

            System.out.print("Please Enter Length Of Rectangle: ");
            double length = charscan.nextDouble();

            System.out.print("Please Enter Width Of Rectangle: ");
            double width = charscan.nextDouble();

            double area = length * width;
            double perimeter = length * 2 + width * 2;

            System.out.println("Area Is:" + length * width);
            System.out.println("Perimeter Is:" + length * 2 + width * 2);
            System.out.println("");

            System.out.print("Do You Want To Continue?, Y/N");
            text = charscan.next();
        }
        while (text.equals("N"));
        System.out.print("See Ya Later Alligator!");

        charscan.close();
    }
}