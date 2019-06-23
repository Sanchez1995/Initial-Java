package Array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayWithDecimals {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.00000");
        Scanner input = new Scanner(System.in);
        double total = 0;


        ArrayList<Double> sum = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            sum.add(input.nextDouble());

        Iterator<Double> it = sum.iterator();
        while (it.hasNext()) {
            total += it.next();

        }
        System.out.println("The total of all the elements in the array is: " + df.format(total));
        System.out.println();
        input.close();

    }
}
