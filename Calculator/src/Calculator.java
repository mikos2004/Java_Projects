package Calculator.src;

import java.util.Scanner;

public class Calculator implements ICalculator {

    private static int userChoice;
    private static double a;
    private static double b;

    /** 
     * Method to print the Calculator's Menu.
     * 
     */
    public static void printMenu(){
        System.out.print("Operation: \n1 - Sum\n2 - Sub\n3 - Mult\n4 - Div\nOption: ");
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double div(double a, double b){
        return a / b;
    }
    
    public static double mult(double a, double b){
        return a * b;
    }

    /** 
     * Gets the userChoice.
     * 
     */
    public static int getUserChoice(){
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        return userChoice;
    }

    
    /** 
     * The respective operation to userChoice is executed.
     * 
     * @param userChoice
     */
    public static void runOperation(int userChoice){

        System.out.print("Choose number 1: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        
        System.out.print("Choose number 2: ");
        b = scanner.nextInt();

        switch (userChoice) {

            case SUM:
                System.out.println("\n" + a + " + " + b + " = " + sum(a, b));
                break;
            case SUB:
                System.out.println("\n" + a + " - " + b + " = " + sub(a, b));
                break;
            case MULT:
                System.out.println("\n" + a + " * " + b + " = " + mult(a, b));
                break;
            case DIV:
                System.out.println("\n" + a + " / " + b + " = " + div(a, b));
                break;
            case LIST_FAIL:
                System.out.println("\n" + a + " / " + b + " = " + div(a, b));
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        // User input
        printMenu();

        getUserChoice();

        while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4) {
           System.out.println("\nYour Option ("+ userChoice +") don't exist. Try again");
           getUserChoice();
        }
           
        System.out.println("\nYour Option: " + userChoice);
        runOperation(userChoice);
    }
}
