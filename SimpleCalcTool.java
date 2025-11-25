import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        double lastResult = 0.0;

        while (running) {
            System.out.println("=== SimpleCalcTool v1.2 (Average + Last Result) ===");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Average of numbers");
            System.out.println("6) Use last result in a new addition");
            System.out.println("7) Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear invalid input
                System.out.println();
                continue;
            }

            if (choice == 7) {
                running = false;
                System.out.println("Exiting... Goodbye!");
                break;
            }

            double a, b, result;

            switch (choice) {
                case 1: // Add
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a + b;
                    lastResult = result;
                    System.out.println("Result: " + result);
                    break;

                case 2: // Subtract
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a - b;
                    lastResult = result;
                    System.out.println("Result: " + result);
                    break;

                case 3: // Multiply
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    result = a * b;
                    lastResult = result;
                    System.out.println("Result: " + result);
                    break;

                case 4: // Divide
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: division by zero is not allowed.");
                    } else {
                        result = a / b;
                        lastResult = result;
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5: // Average
                    System.out.print("How many numbers? ");
                    int n = scanner.nextInt();
                    if (n <= 0) {
                        System.out.println("You must enter at least 1 number.");
                        break;
                    }
                    double sum = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        sum += scanner.nextDouble();
                    }
                    double average = sum / n;
                    lastResult = average;
                    System.out.println("Average: " + average);
                    break;

                case 6: // Use last result
                    System.out.println("Last result is: " + lastResult);
                    System.out.print("Enter a number to add to last result: ");
                    b = scanner.nextDouble();
                    result = lastResult + b;
                    lastResult = result;
                    System.out.println("New result: " + result);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
