import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of the columns : ");
        int c = sc.nextInt();

        int[][] nums = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
