package Sorting;

import java.util.ArrayList;

public class BucketMethod4Sort {

}
    /*ublic static void main(String[] args) {
        int [] data = {5, 7, 0, 2, 4, 1230, 1, 0, 6, 2, 3, 1, 4, 3, 120, 16, 17};
        *//*int noOfElements = data.length;
        ArrayList<Integer>[] bucket = new ArrayList[noOfElements];*//*
        int n = sizeof(data)/sizeof(data[0]);
        bucketSort(data, n);

        cout << "Sorted array is \n";
        for (int i=0; i<n; i++)
            cout << data[i] << " ";
        return 0;
    }

    public static void bucketSort(int data[], int n)
    {
        // 1) Create n empty buckets
        vector<> b[n];

        // 2) Put array elements in different buckets
        for (int i=0; i<n; i++)
        {
            int bi = n*data[i]; // Index in bucket
            b[bi].push_back(data[i]);
        }

        // 3) Sort individual buckets
        for (int i=0; i<n; i++)
            sort(b[i].begin(), b[i].end());

        // 4) Concatenate all buckets into data[]
        int index = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < b[i].size(); j++)
                data[index++] = b[i][j];
    }
}
*/