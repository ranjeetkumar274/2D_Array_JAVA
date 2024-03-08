import java.util.Scanner;

public class MatrixinWaveeForm {


    public static void waveform(int[][] nums) {
        int m = nums.length, n = nums[0].length;
        for(int i = 0; i < m; i++){
            if(i%2==0){
                for(int j = 0; j < n; j++){
                    System.out.print(nums[i][j]+" ");
                }
            }
            else{
                for(int j = n-1; j >= 0; j--){
                    System.out.print(nums[i][j]+" ");
                }
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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        print(nums);
        System.out.println();
        waveform(nums);

    }
}