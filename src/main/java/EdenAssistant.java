import java.util.Scanner;
import java.util.InputMismatchException;

public class EdenAssistant {
    static Scanner scanner = new Scanner(System.in);
    public static byte currentTime = 0;
    public static boolean isOpen = false;

    public static void main(String[] args) {
        EdenAssistant edenAssistant = new EdenAssistant();
        currentTime = (byte)20;

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
        /**
         * Print in stdout all the park's features, prefixed by an number to be later entered by the user.
         */
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
        /**
         * First pass on a class import with a single attribute and method.
         */
        Dinosaur dino = new Dinosaur("paco");
        dino.greet();
    }


    public boolean isParkOpen (byte currentTime) {
        return currentTime >= 8 && currentTime <= 19;
    }

    public void checkParkHours(byte currentTime) {
        /**
         * Prints in stdout either the park is open or not.
         */
        if (isParkOpen(currentTime)) {
            System.out.println("The park is open. Visitors are welcome.");
        } else {
            System.out.println("The park is closed. We need to perform some minor repairs and clean up the alleys.");
        }
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
