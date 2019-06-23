package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNoDuplicates {

   /*public static void removeDuplicats(ArrayList<Integer> list){
       for (int i = 0; i < list.size() -1; i++){
           for (int j=i+1; j<list.size(); j++){
               if (list.get(i)) == list.get())
               list.remove(j);
           }
       }
   }*/


    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 Integers");

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());

        }

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        ArrayList<Integer>
                newList = removeDuplicates(list);


        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);

    }

}

