import java.util.Scanner;

public class Program_04_NumberSwap {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("\nBefore Swapping");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);


    }

}