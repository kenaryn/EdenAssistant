import java.util.Scanner;

public class EdenAssistant {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EdenAssistant edenAssistant = new EdenAssistant();
        edenAssistant.start();
    }

    public void start() {
        // Main application's loop. Keeps running until user decides to exit.
        while (true) {
            displayMenu();
            byte choiceItemMenu = scanner.nextByte();
            handleChoiceMenu();
        }
    }
}
