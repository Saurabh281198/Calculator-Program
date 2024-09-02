import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorProgram extends BaseProgramFile {

    /*
     * 
     * 
     * Calculator Operations Functionality Program
     * can be used to perform:-
     * 1. Addition
     * 2. Substraction
     * 3. Multiplication
     * 4. Division
     * 
     * ## Code is build dynamically considering the negative scenarios
     * 
     * 
     * 
     */

    public static void main(String[] args) {

        // Creating the object for scanner class
        Scanner sc = new Scanner(System.in);

        // Starting process to calculate the values
        System.out.println("Let's start calculating the values");
        System.out.println();

        // Using try-catch-finally block to execute the program
        try {

            // Initializing variable i and final answer
            int i = 1;
            double finalAnswer = 0;

            // Taking the input from the user for 1st number
            System.out.print("Enter the 1 number : ");
            double number1 = sc.nextDouble();

            // Considering first number input from user is our current final answer
            finalAnswer = number1;

            // Creating a loop to perform operations and calculate values
            while (true) {
                displayOperations();

                int actionStatus = sc.nextInt();

                if (actionStatus == 1) {
                    finalAnswer = addNumbers(sc, finalAnswer, i);
                } else if (actionStatus == 2) {
                    finalAnswer = subtractNumbers(sc, finalAnswer, i);
                } else if (actionStatus == 3) {
                    finalAnswer = multiplyNumbers(sc, finalAnswer, i);
                } else if (actionStatus == 4) {
                    finalAnswer = divideNumbers(sc, finalAnswer, i);
                } else if (actionStatus == 5) {
                    exitProgram();
                    break;
                } else {
                    throw new Exception();
                }
                i++;
            }

            // Taking user's preferance and displaying the final answer
            checkingAnswerFormat();
            int userAnswerChoice = sc.nextInt();
            if (userAnswerChoice == 1) {
                displayRoundOfFinalAnswer(finalAnswer, number1);
            } else if (userAnswerChoice == 2) {
                displayFinalAnswer(finalAnswer, number1);
            } else {
                throw new Exception();
            }

        } catch (InputMismatchException ime) {
            System.out.println();
            System.out.println("Please input valid number and try again later");

        } catch (Exception e) {
            System.out.println();
            System.out.println("Please select valid option and try again later");

        } finally {
            // Closing the scanner
            sc.close();
        }
    }
}
