import java.util.Scanner;

public class FlippingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (nums[i][0] == 0) {
                //flip that row
                for (int j = 0; j < 4; j++) {
                    if (nums[i][j] == 0) nums[i][j] = 1;
                    else {
                        nums[i][j] = 0;
                    }
                }
            }
        }
        for(int j = 1; j < 4; j++){
            int noOfZeroes = 0;
            int noOfOnes = 0;
            for(int i = 0; i < 3; i++){
                if(nums[i][j] == 0) noOfZeroes++;
                else{
                    noOfOnes++;
                }
                    }
            if(noOfZeroes > noOfOnes){
                for(int i = 0; i < 3; i++){
                    if(nums[i][j] == 0) nums[i][j] = 1;
                    else nums[i][j] =0;
                }
            }
        }
        int score = 0;
        int x = 1;
        for(int j = 3; j >= 0; j--){
            for(int i = 0; i < 3; i++){
                score += (nums[i][j]*x);
            }
            x *= 2;
        }
        System.out.println(score);

    }
}
