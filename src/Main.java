//JP Rodriguez
//Lab 3
//Problem 2
/* The space complexity of the first method is higher than the second method due to the use of the extra matrix.
* The space complexity would be O(1) because a constant space would be needed,
* but the time complexity would be O(N*N) where N would be a single side of the array.
* I would prefer to use the second method in case you were to rotate the matrix multiple times. */
public class Main {
    static void rotate(int[][]matrix, int n) {

        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n - i - 1; j++){

                int temporary = matrix[i][j];

                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];

                matrix[j][n-1-i] = temporary;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j =0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int matrix[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix, n);
    }

}