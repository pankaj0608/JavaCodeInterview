package basic;

/**
 * Created by pankaj on 8/11/2015.
 */
public class BubbleSort {
    public static void main(String[] args) {

        //int[] numbers = {1,4,6,1,3,7,9,12,2,-1};
        int[] numbers = {1,4,-1};
        int temp;
        for(int item : numbers) {
            System.out.print(item + ",");
        }

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    System.out.println("");
                    for(int item : numbers) {
                        System.out.print(item + ",");
                    }
                }
            }
        }

        System.out.println("");
        for(int item : numbers) {
            System.out.print(item + ",");
        }
    }

}
