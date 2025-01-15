import java.util.Scanner;
import java.util.InputMismatchException;

public class EdenAssistant {
    static Scanner scanner = new Scanner(System.in);
    public static byte currentTime;

    public static void main(String[] args) {
        EdenAssistant edenAssistant = new EdenAssistant();
        currentTime = (byte)18;

        edenAssistant.start();
        scanner.close();
    }

    public void start() {
        // Main application's loop. Keeps running until user decides to exit.
        while (true) {
            displayMenu();

            try {
                byte choiceItemMenu = scanner.nextByte();
                handleChoiceMenu(choiceItemMenu);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("""
                Welcome to Mesozoic Eden assistant!
                1. Add dinosaur
                2. Check park hours
                3. Greet guest
                4. Check visitors count
                5. Manage staff
                6. Exit
                """);
        System.out.print("Enter your choice: ");
    }


    public void addDinosaur() {
        Dinosaur dino = new Dinosaur("paco");
        dino.greet();
    }


    public boolean checkParkHours (byte currentTime) {
        return currentTime >= 8 && currentTime <= 19;
    }


    public void handleChoiceMenu(byte choice) {
        switch (choice) {
            case 1 -> addDinosaur();
            case 2 -> checkParkHours(currentTime);
//            case 3 -> greetGuest();
//            case 4 -> checkVisitorsCount();
//            case 5 -> manageStaff();
            case 6 -> {
                System.out.println("Exiting...");
                System.exit(0);
            }
            default -> System.exit(0);
        }
    }
}
