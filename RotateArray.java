import java.util.Scanner;
public class RotateArray {
    public static void reverse(int[][] nums) {
        int m = nums.length;
        for(int i = 0; i < m; i++){
            int a = 0;
            int b = m-1;
            while(a < b) {
                int temp = nums[i][a];
                nums[i][a] = nums[i][b];
                nums[i][b] = temp;
                a++;
                b--;
            }
        }
    }
    public static void swap(int[][] nums) {
        int m = nums.length, n = nums[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j <= i; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
            System.out.println();
        }
    }
    public static void print(int[][] nums) {
        int m = nums.length, n = nums[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("enter the number of columns : ");
        int n = sc.nextInt();

        int[][] nums = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        print(nums);
        swap(nums);
        print(nums);
        reverse(nums);
        print(nums);
    }
}
