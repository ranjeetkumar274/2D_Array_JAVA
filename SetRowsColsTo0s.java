public class SetRowsColsTo0s {
    public static void main(String[] args) {
        int[][] nums = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = nums.length;
        int n = nums[0].length;
        int[][] copy = new int[m][n];

        //storing all the elements of the nums array into the copy array
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                copy[i][j] = nums[i][j];
            }
        }
        //check the 0s in the copy array and change the row and column in the nums array
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (copy[i][j] == 0) {
                    //set the row to 0's
                    for (int a = 0; a < m; a++) {
                        nums[a][j] = 0;
                    }
                    //set the column to 0's
                    for (int b = 0; b < n; b++) {
                        nums[i][b] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
