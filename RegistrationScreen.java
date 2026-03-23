import java.util.Scanner;

public class RegistrationScreen {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- New User Registration ----------");
        System.out.print("Input a unique username (left blank to cancel): ");
        String user = scanner.nextLine();
        
        if (user.isEmpty()) {
            new WelcomeScreen().display();
            return;
        }

        System.out.print("Input password: ");
        String pass = scanner.nextLine();
        System.out.print("Input confirm password: ");
        String confirm = scanner.nextLine();

        if (pass.equals(confirm)) {
            System.out.println("Registration Successful! Please login.");
        } else {
            System.out.println("Passwords do not match. Try again.");
        }
        new WelcomeScreen().display();
    }
}