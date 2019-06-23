package Sorting;

public class Method2Sort {

    /* public static int [] quickSort(int arr[], int low, int high)
     {
         if (low < high)
         {
         *//* pi is partitioning index, arr[pi] is now
           at right place *//*
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }*/
 /*  void swap(int low, int high) {
       int temp = low;
    low = high;
    high = temp;
   }*/
/* bubblesort
    int[] array = {1, 9, 4, 6, -9, 5, -4, 10, 33, 2};
    int n = array.length;
    int temp = 0;

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            if (array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }

        }
        for(int j=1;j<n-i;j++){
            System.out.print(array[j]+", ");
        }
        System.out.println();
    }
        for (int i = 0; i < n; i++)
            System.out.println(array[i]);
}*/
    public static void main(String[] args) {
        int[] array = {1, 9, 4, 6, -9, 5, -4, 10, 33, 2};
        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - 1; j--) {
                if (array[j] > array[j - 1]) {
                    temp = array[j];
                    for (int x = 0; x < j; x++) {
                        if (temp > array[j - x]) {
                        } else {
                            temp = array[j - x];
                            array[j - x] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }

            for (int j = 1; j < n - i; j++) {
                System.out.print(array[j] + ", ");
            }
            System.out.println(array[i]);}
        System.out.println();

    }

}
