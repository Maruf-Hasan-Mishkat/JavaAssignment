import java.util.Scanner;

public class Program_02_CelsiusFahrenheit {
    public static void main(String[] args) {
        
        
        System.out.println("Temperature Converter");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your choice: ");
        int choice = input.nextInt(); //reading a decimal number

        if (choice == 1){
            System.out.print("Enter temperature in celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit = (9 * celsius / 5) + 32; 
            System.out.println("Temperature in fahrenheit: "+fahrenheit);
        } 

        else if (choice == 2){
            System.out.print("Enter temperature in fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9; 
            System.out.println("Temperature in celsius: "+ celsius);

        }

        else{
            System.out.println("Invalid");
        }

        
    }
}
