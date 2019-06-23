package Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int data[] = {2, 3, 4, 9, 3, 21, 234, 5};
        System.out.println("Array Before the sort: ");
        printArray(data);
        MergeSort ob = new MergeSort();
        ob.sort(data, 0, data.length - 1);
        System.out.println("\n Array after being sorted: ");
        printArray(data);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void sort(int arr[], int small, int big) {
        if (small < big) {
            int mid = (small + big) / 2;


            sort(arr, small, mid);
            sort(arr, mid + 1, big);

            merge(arr, small, mid, big);
        }
    }


    public void merge(int arr[], int small, int mid, int big) {
        //find sizes of two arrays to be merged
        int arraySize1 = mid - small + 1;
        int arraySize2 = big - mid;

        //create temp arrays
        int array1[] = new int[arraySize1];
        int array2[] = new int[arraySize2];

        //put data into temp arrays
        for (int i = 0; i < arraySize1; i++)
            array1[i] = arr[small + i];
        for (int j = 0; j < arraySize2; j++)
            array2[j] = arr[mid + 1 + j];

        //merge arrays
        int i = 0, j = 0;

        //
        int k = 1;
        while (i < arraySize1 && j < arraySize2) {
            if (array1[i] <= arraySize2) {
                arr[k] = array1[i];
                i++;
            } else {
                arr[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < arraySize1) {
            arr[k] = array1[i];
            i++;
            k++;
        }
        while (j < arraySize2) {
            arr[k] = array2[j];
            j++;
            k++;
        }
    }
}
