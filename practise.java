import java.util.*;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here a row size : ");
        int size = sc.nextInt();
        System.out.println("Enter here colomn size : ");
        int size1 = sc.nextInt();
        int[][] matrix = new int[size1][size1];
         System.out.println("Enter here " + size*size1 +" elements :");
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                matrix[i][j]=sc.nextInt();
            }
         }
         for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
         System.out.println("Enter here a target :");
         int target = sc.nextInt();
        int[] x = binary2d(matrix, target);
        System.out.println(Arrays.toString(x));
    }
    static int[] binary2d(int[][] matrix,int target){
        int row = 0 ;
        int col = matrix.length-1 ;
        while (row <= col) {
            if (matrix[row][col]==target) {
                return new int[]{row+1,col+1};
            }
            else if(matrix[row][col] < target){
                row++;
             }
             else{
                col--;
             }
        }
        return new int[]{-1,-1};
    }
}
