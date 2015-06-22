package basic;

/**
 * Created by pankaj on 6/21/2015.
 */
public class RotateMatrix {

    public static void main(String[] args) {

        int matrix[][] = {{1,2,3},{4,5,6}, {7,8,9}};

        printMatrix(matrix);

        rotateMatrix(matrix);
    }

    private static void rotateMatrix(int matrix[][]) {

    }


    private static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0 ;j<matrix[i].length; j++ )
                System.out.print(matrix[i][j] + " ");
            System.out.println("");
        }
    }
}
