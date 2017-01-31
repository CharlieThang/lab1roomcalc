import java.util.Scanner;

/**
 * Created By Charlie Woods
 * 1/30/2017
 * This Utility Calculates The Perimeters Of A Room
 */
public class RoomCalc{
    public static void main (String [] args) {
        //1. set up resources
        Scanner charscan = new Scanner(System.in);

        //2. purpose of this utility
        System.out.println("This Is A Room Calculator Utility");

        //3. ask for input
        System.out.print("Please enter length of rectangle: ");
        double length = charscan.nextDouble();

        System.out.print("Please enter width of rectangle: ");
        double width = charscan.nextDouble();

        System.out.print("Do You Want To Continue?, Y/N");
        String user_input charscan.next();

                double Perimeter = (length * 2 + width * 2);

                //4. perform calculations
                double RoomCalc = length * 2 + width * 2;

                //5. output results
                System.out.println("The Perimeter is " + RoomCalc);

                //6. close out resources
                charscan.close();

                System.out.println("Length:" + length);
                System.out.println("Width:" + width);
                System.out.println("Area:" + length * width);
                System.out.println("Perimeter:" + RoomCalc);

            }




}




