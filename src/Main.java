import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Where do you want to go? Beach or Mountain?");
            String destination = scanner.nextLine();

            if (!destination.equalsIgnoreCase("beach") && !destination.equalsIgnoreCase("mountain")) {
                System.out.println("There's no information about this type of vacation.");
                continue;
            }
            System.out.println("What your budget per day/per person?");
            double budget = scanner.nextDouble();
            scanner.nextLine();
            if (budget <= 0) {
                System.out.println("Go to work. No vacation for you.");
                return;
            }

            // Creating the options for
            if (destination.equalsIgnoreCase("beach")) {
                if (budget <= 50) {
                    System.out.println("Recommended destination: The Bulgarian beaches");
                } else if (budget > 50) {
                    System.out.println("Recommended destination: Beaches abroad");
                }

            } else if (destination.equalsIgnoreCase("mountain")) {
                if (budget <= 30) {
                    System.out.println("Recommended destination: The Bulgarian mountains");
                } else if (budget > 30) {
                    System.out.println("Recommended destination: Mountains abroad.");
                }

            }
            System.out.println("Would you like to check another vacation option?");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("yup")) {
                break;
            }
        }
    }
}