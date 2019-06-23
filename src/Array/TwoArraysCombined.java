package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArraysCombined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter 5 Integers for list 1: ");
        for (int i = 0; i < 10; i++) {
            list1.add(input.nextInt());
        }


        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter 5 Integers for list 2: ");
        for (int i = 0; i < 10; i++) {
            list2.add(input.nextInt());
        }
        ArrayList<Integer> combinedArray = new ArrayList<>();
        combinedArray.addAll(list1);
        combinedArray.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("combinedList: " + combinedArray);
    }
}
