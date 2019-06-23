package Recursion;

import java.util.Scanner;

public class CalculateFibonacci {

    static int count = 0;

   /* public static CalculateFibonacci numOfFib = new CalculateFibonacci() ;

    public void countFib() {
        count++;
    }
    public void getCount(){
        System.out.println(count);
    }*/


    public static void main(String args[]) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

            System.out.print("Enter an index for the Fibonacci number: ");
            int index = input.nextInt();


            // Find and display the Fibonacci number
            System.out.println(
                    "Fibonacci number at index " + index + " is " + fib(index));
        System.out.println(count);
            //Display count of method

            /*numOfFib.getCount();*/

    }

    /** The method for finding the Fibonacci number */
    public static long fib(long index) {
        count++;
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }

}
