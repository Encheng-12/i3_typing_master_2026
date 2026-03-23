
import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Default username and password
        String correctUsername = "admin";
        String correctPassword = "1234";

        // Ask user input
        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        // Check login
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password");
        }

        input.close();
    }
}