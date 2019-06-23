import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class SortArrayList {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fin = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        // sort numbers
        sort(list);

        //display list in increasing order
        System.out.println(list.toString());
        //display list in decreasing order
        reverse(list);
        System.out.println(list.toString());

    }
}
