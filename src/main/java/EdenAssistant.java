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
            handleChoiceMenu(choiceItemMenu);
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

    public void handleChoiceMenu(byte choice) {
        switch (choice) {
            case 1 -> addDinosaur();
//            case 2 -> checkParkHours();
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
