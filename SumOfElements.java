import java.util.Scanner;

public class SumOfElements {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] nums = new int[4][3];

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    nums[i][j] = sc.nextInt();
                }
            }

            int sum = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    sum += nums[i][j];
                }
            }
            System.out.println("sum of total elements in the array  is : "+sum);
        }

    }
