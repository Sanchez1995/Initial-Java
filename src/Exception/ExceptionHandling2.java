package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {

    public static int[] makeArray() {
        //Display or show the MDA
        int[] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100+1);
        }

        return array;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = makeArray();
        System.out.println("Enter input");
            try {
                int number = input.nextInt();
                System.out.println("Finding the index ...");
                System.out.println("The array index is: " + number + "and the element value is: " + array[number]);

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Out of Bounds!");
                input.nextLine();
            } catch (InputMismatchException ex){
                System.out.println("Please enter an integer");
            }
        input.close();

    }
}
