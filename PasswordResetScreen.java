import java.util.Scanner;

public class PasswordResetScreen {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------- Password Reset ----------");
        System.out.print("Enter your username to reset password (blank to cancel): ");
        String username = scanner.nextLine();

        if (username.isEmpty()) {
            new WelcomeScreen().display();
            return;
        }

        // Logic check: In a real app, verify if the user exists in the DB here
        System.out.print("Enter new password: ");
        String newPass = scanner.nextLine();
        System.out.print("Confirm new password: ");
        String confirmPass = scanner.nextLine();

        if (newPass.equals(confirmPass) && !newPass.isEmpty()) {
            System.out.println("Password reset successful for user: " + username);
            System.out.println("You can now login with your new password.");
        } else {
            System.out.println("Error: Passwords do not match or are empty.");
        }

        new WelcomeScreen().display();
    }
}