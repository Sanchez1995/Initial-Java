package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Method3Sort {
    public static int[] data;
    public static int maxValue;
    public static List<Integer>[] bucket = new ArrayList[maxValue];

    public static void main(String[] args) {

        int[] data = {5, 3, 7, 2, 3, 1};

        for (int i = 0; i < data.length; i++) {
            if (maxValue < data[i]) {
                maxValue = data[i];
            }
        }

        sortMethod(data);
        /*System.out.println(sortMethod(data));*/

    }

    public static void sortMethod(int[] input) {


        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        //count the no of time what i am iterating through matches with the data element
        for (int j = 0; j < bucket.length; j++) {
            for (int i = 0; i < data.length; i++) {
                if (j==data[i]) {
                    bucket[j].add(data[j]);
                }
            }
        }System.out.println(bucket);
        System.out.println(data);



    }
}
