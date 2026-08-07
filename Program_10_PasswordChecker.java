import java.util.Scanner;

public class Program_10_PasswordChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password;

        do {

            System.out.print("Enter Password: ");
            password = input.nextLine();

        } while (!password.equals("java123"));

        System.out.println("Access Granted!");


    }

}