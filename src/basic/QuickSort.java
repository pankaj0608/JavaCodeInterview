package basic;

import java.util.Arrays;

/**
 * Created by pankaj on 8/11/2015.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] x = {9, 2, 4, 7, 3, 7, 10,-1};
        //int[] x = {8, 8, 1, 2};

        System.out.println(Arrays.toString(x));

        quicSort(x, 0, x.length - 1);

        System.out.println(Arrays.toString(x));

    }

    private static void quicSort(int[] arr, int low, int high) {

        if(low >= high) {
            return;
        }

        int mid =(low+high) /2;
        int pivot = arr[mid];

        int i=low;
        int j=high;

        while(i<j) {

            while(arr[i] < pivot) {
                i++;
            }

            while(arr[j] > pivot) {
                j--;
            }

            if(i<=j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

        }

        if(low<j) {
            quicSort(arr, low, j);
        }

        if(high > 1) {
            quicSort(arr, i, high);
        }



    }
}