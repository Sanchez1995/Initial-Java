package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {

    public static int addition(int number1, int number2) {
        if (number2 < 0 || number1 <0)
            throw new InputMismatchException("Inputs must be integers");

        return number1 + number2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int result = addition(number1, number2);
                System.out.println("The number " + number1 + " added with " + number2 + " is equal to " + result);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input: two integers are required");
                input.nextLine();
            }
        } while(continueInput);
        input.close();
    }
}
