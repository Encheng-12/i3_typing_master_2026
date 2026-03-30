import java.util.Scanner;

public class WelcomeScreen {
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("\n---------- Welcome to I3 Typing Master v2026 ----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println(" 1. Login");
        System.out.println(" 2. Register");
        System.out.println(" 3. Forgot Password");
        System.out.println(" 4. Exit");
        System.out.print("Choose an option: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                new LoginScreen().display();
                break;
            case "2":
                new RegistrationScreen().display();
                break;
            case "3":
                new PasswordResetScreen().display();
                break;
            case "4":
                System.out.println("Exiting... Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                display();
        }
    }

    public static void main(String[] args) {
        new WelcomeScreen().display();
    }
}