import java.util.Scanner;

public class TypingMaster {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
        displayMenu();
        System.out.print("Choose an option: - ");
        String input = scanner.nextLine().trim();

        switch (input) {
            case "1":
                login(scanner);
                break;
            case "2":
                register(scanner);
                break;
            case "3":
                System.out.println("\nExiting I3 Typing Master. Goodbye!");
                running = false;
                break;
            default:
                System.out.println("\nInvalid option. Please choose 1, 2, or 3.\n");
        }
    }

    scanner.close();
}

static void displayMenu() {
    System.out.println("------------ Welcome to I3 Typing Master v2026 ------------");
    System.out.println("To begin, please select one of the following options:");
    System.out.println("  1. Login");
    System.out.println("  2. Register");
    System.out.println("  3. Exit");
}

static void login(Scanner scanner) {
    System.out.println("\n--- Login ---");
    System.out.print("Username: ");
    String username = scanner.nextLine();
    System.out.print("Password: ");
    String password = scanner.nextLine();

    // Placeholder login logic
    if (!username.isEmpty() && !password.isEmpty()) {
        System.out.println("\nLogin successful! Welcome, " + username + "!\n");
    } else {
        System.out.println("\nLogin failed. Username or password cannot be empty.\n");
    }
}

static void register(Scanner scanner) {
    System.out.println("\n--- Register ---");
    System.out.print("Enter a new username: ");
    String username = scanner.nextLine();
    System.out.print("Enter a new password: ");
    String password = scanner.nextLine();
    System.out.print("Confirm password: ");
    String confirm = scanner.nextLine();

    // Placeholder registration logic
    if (username.isEmpty() || password.isEmpty()) {
        System.out.println("\nRegistration failed. Fields cannot be empty.\n");
    } else if (!password.equals(confirm)) {
        System.out.println("\nRegistration failed. Passwords do not match.\n");
    } else {
        System.out.println("\nRegistration successful! You can now login as " + username + ".\n");
    }
}
}