import java.util.Scanner;

public class BaseProgramFile {

    /*
     * 
     * 
     * Base file where all the Calculator Operations Functionality has been defined
     * will be used to perform:-
     * 1. Addition
     * 2. Substraction
     * 3. Multiplication
     * 4. Division
     * 5. Exit the application
     * 6. Displaying the final answer
     * 
     * ## Code is build dynamically considering the negative scenarios
     * 
     * 
     * 
     */

    // Methods for displaying the list of operations
    public static void displayOperations() {

        System.out.println();
        System.out.println("What action do you want to perform?");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Exit the program and navigate to final answer menu");

    }

    // Method to add the numbers
    public static double addNumbers(Scanner sc, double finalAnswer, int i) {

        System.out.println();
        System.out.print("Enter the " + (i + 1) + " number : ");
        double number = sc.nextDouble();
        finalAnswer = finalAnswer + number;
        System.out.println("Answer: " + finalAnswer);
        return finalAnswer;

    }

    // Method to subtract the numbers
    public static double subtractNumbers(Scanner sc, double finalAnswer, int i) {

        System.out.println();
        System.out.print("Enter the " + (i + 1) + " number : ");
        double number = sc.nextDouble();
        finalAnswer = finalAnswer - number;
        System.out.println("Answer: " + finalAnswer);
        return finalAnswer;

    }

    // Method to multiply the numbers
    public static double multiplyNumbers(Scanner sc, double finalAnswer, int i) {

        System.out.println();
        System.out.print("Enter the " + (i + 1) + " number : ");
        double number = sc.nextDouble();
        finalAnswer = finalAnswer * number;
        System.out.println("Answer: " + finalAnswer);
        return finalAnswer;

    }

    // Method to divide the numbers
    public static double divideNumbers(Scanner sc, double finalAnswer, int i) {

        System.out.println();
        System.out.print("Enter the " + (i + 1) + " number : ");
        double number = sc.nextDouble();
        finalAnswer = finalAnswer / number;
        System.out.println("Answer: " + finalAnswer);
        return finalAnswer;

    }

    // Method to exit the program
    public static void exitProgram() {

        System.out.println();

    }

    // Method to display the final answer
    public static void displayFinalAnswer(double finalAnswer, double number1) {

        System.out.println();
        if (finalAnswer != number1) {
            System.out.println("Thank you for using the program");
            System.out.println("Your Final Answer: " + finalAnswer);
        }

    }

    // Method to display the final answer with 2 decimal points
    public static void displayRoundOfFinalAnswer(double finalAnswer, double number1) {

        System.out.println();
        if (finalAnswer != number1) {
            finalAnswer = ((double) Math.round(finalAnswer * 100) / 100);
            System.out.println("Thank you for using the program");
            System.out.println("Your Final Answer: " + finalAnswer);
        }

    }

    // Method to check if user wants final answer with 2 decimal points
    public static void checkingAnswerFormat() {

        System.out.println("Do you want final answer with 2 decimal points?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");

    }
}
