import java.util.Scanner;

public class WelcomeScreen {
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("\n---------- Welcome to I3 Typing Master v2026 ----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println(" 1. Login");
        System.out.println(" 2. Register");
        System.out.println(" 3. Exit");
        System.out.print("Choose an option: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            new LoginScreen().display();
        } else if (choice.equals("2")) {
            new RegistrationScreen().display();
        } else if (choice.equals("3")) {
            System.out.println("Exiting... Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Try again.");
            display(); // Restart the menu
        }
    }

    public static void main(String[] args) {
        new WelcomeScreen().display();
    }
}