package basic;

/**
 * Created by pankaj on 8/11/2015.
 */
public class MergeSort {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 6, 1, 3, 7, 9, 12, 2, -1};
        int temp[] = new int[numbers.length];

    }

    private static void mergeSort(int[] numbers, int[] temp, int start, int
            end) {

        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(numbers, temp, start, middle);
            mergeSort(numbers, temp, middle + 1, end);

            merge(numbers, temp, start, middle, end);

        }
    }

    private static void merge(int[] numbers, int[] temp, int start, int middle,
                              int end) {

        for(int i=start; i<end; i++) {
            temp[i] = numbers[i];
        }

    }
}
