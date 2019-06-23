package Sorting;

import java.util.ArrayList;

public class Method1Sort {
    public static void main(String[] args) {


        int[] data = {331, 454, 230, 34, 343, 45, 59, 453, 345, 231, 9, 450};
        int [] data2 ={};
        int n = 10;
        int temp = 0;

        ArrayList<Integer>[] container = new ArrayList[n];

        //initializing 9 arrayLists in container array
        for (int x = 0; x < n; x++) {
            container[x] = new ArrayList<>();
        }

        /*while (temp< data.length) {*/
            //scan the data array, item is the index of the data array
            for (int item = 0; item < data.length; item++) {

                /*or (int j = 0; j < container[j].size(); j++) {*/
                //from 0-9 if item in data is equal to
                for (int j = 0; j < n; j++) {
                    //add data to the container
                    if ((data[item] )% 10 == j) {
                        container[j].add(data[item]);


                    /*} else if ((data[item] / 10*temp) % 10 == j) {
                        container[j].add(data[item]);*/
                        /*container[j].remove(data[temp]);*/
                    }
                }
            /*}temp++;*/
        }
        /*for (int containerNum = 0; containerNum < data.length; containerNum++) {
           for (int x=0; x<n;x++){
               if ((container[data[containerNum]]/10)%10=x){

               }
           }
        }*/

        for (int j = 0; j < n; j++) {
            System.out.println(container[j]);
        }



    }
}
