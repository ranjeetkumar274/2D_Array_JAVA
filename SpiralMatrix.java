import java.util.Scanner;

public class SpiralMatrix {

    public static void spiral(int[][] nums) {
        int m = nums.length, n = nums[0].length;
        int minr = 0;
        int maxr = m-1;
        int minc = 0;
        int maxc = n-1;
        while((minr <= maxr) && (minc <= maxc)){

            for(int j = minc; j <= maxc; j++){
                System.out.print(nums[minr][j]+" ");
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i = minr; i <= maxr; i++){
                System.out.print(nums[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc; j >= minc; j--){
                System.out.print(nums[maxr][j]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i = maxr; i >= minr; i--){
                System.out.print(nums[i][minc]+" ");
            }
            minc++;

        }
        System.out.println();

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
        spiral(nums);


    }
}
