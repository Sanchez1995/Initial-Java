package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExecptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("The number entered is " + number1);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while(continueInput);
        input.close();
    }
}
