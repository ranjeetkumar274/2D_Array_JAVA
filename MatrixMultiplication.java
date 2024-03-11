import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums1 = new int[2][3];
        int[][] nums2 = new int[3][4];
        int[][] ans = new int[nums1.length][nums2[0].length];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                nums1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums2[i][j] = sc.nextInt();
            }
        }

        if(nums1[0].length != nums2.length){
            System.out.print("Multiplication is not possible.");
        }
        else{
            for(int i = 0; i < nums1.length; i++){
                for(int j = 0; j < nums2[0].length; j++){
                    for(int k = 0; k < nums2.length; k++){
                        ans[i][j] += (nums1[i][k]*nums2[k][j]);
                    }
                }
            }

            for(int[] ele : ans){
                for(int x : ele){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}
