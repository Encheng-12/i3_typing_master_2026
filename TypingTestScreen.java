import java.util.Scanner;

public class TypingTestScreen {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        String targetText = "ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl;";
        
        System.out.println("\n---------- Typing Test Level 1 ----------");
        System.out.println("Type the following paragraph(s) (press ENTER to end):");
        System.out.println("\n" + targetText);
        System.out.println("---------------------------------------------------------");

        long startTime = System.currentTimeMillis();
        String userInput = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        double timeInSeconds = (endTime - startTime) / 1000.0;
        new TestResultScreen(userInput, targetText, timeInSeconds).display();
    }
}