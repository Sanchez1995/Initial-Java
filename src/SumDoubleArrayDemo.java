import java.util.Scanner;

public class SumDoubleArrayDemo {
    public static void main(String[] args) {
        double [] myList = new double[9];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter " + myList.length + " numbers ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();

            double total = 0;
            for (int j = 0; j< myList.length; j++) {
                total += myList[j];
            }
            System.out.println("The total is " + total);
        }
    }

