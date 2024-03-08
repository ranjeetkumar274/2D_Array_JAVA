import java.util.Scanner;

public class AddTwoMatrices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums1 = new int[4][3];
        int[][] nums2 = new int[4][3];
        int[][] res = new int[4][3];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                nums1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                nums2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                res[i][j] = nums1[i][j]+nums2[i][j];
            }
        }
        for(int[] ele : res){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}
