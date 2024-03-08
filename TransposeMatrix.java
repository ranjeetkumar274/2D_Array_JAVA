import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of coloumns : ");
        int n = sc.nextInt();

        int[][] nums = new int[m][n];
        int[][] transpose = new int[n][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        // storing the transpose of the matrix in a new matrix
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transpose[j][i] = nums[i][j];
            }
            System.out.println();
        }
       for(int[] ele : transpose){
           for(int x : ele){
               System.out.print(x+" ");
           }
           System.out.println();
       }
    }
}
