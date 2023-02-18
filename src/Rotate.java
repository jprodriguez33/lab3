import java.util.Arrays;
//JP Rodriguez
//Lab 3
//Problem 1
public class Rotate {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                newMatrix[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){

        int matrix[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);

    }
}
