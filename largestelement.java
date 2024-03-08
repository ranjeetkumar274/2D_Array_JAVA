import java.util.Scanner;
public class largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[4][3];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                mx = Math.max(mx,nums[i][j]);
            }
        }
        System.out.println("greatest element in the array is : "+mx);
    }

}
