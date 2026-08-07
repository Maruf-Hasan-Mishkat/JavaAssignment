import java.util.Scanner;

public class Program_08_LeapYearTernary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "Leap Year"
                : "Not a Leap Year";

        System.out.println(year + " is " + result + ".");

    }

}