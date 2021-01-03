package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
   /*
        Input
        N = 4, M =5
        arr1[] = {1, 3, 5, 7}
        arr2[] = {0, 2, 6, 8, 9}
        Output: 0 1 2 3 5 6 7 8 9
        Explanation: Since you can't use any
        extra space, modify the given arrays
        to form
        arr1[] = {0, 1, 2, 3}
        arr2[] = {5, 6, 7, 8, 9}

    */

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=arr1.length-1;
        int j=0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
