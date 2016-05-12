/**
 * Created by kimmin on 5/12/16.
 */
public class DP2d {
    public static void main(String[] args){
        int[] nums = {1, -1, 1, 2, 4};

        int[][] s = new int[nums.length][nums.length];

        // Init L1
        for(int i=0; i<nums.length; i++){
            s[0][i] = nums[i];
        }

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<(nums.length - i); j++){
                int max = Integer.MIN_VALUE;
                max = Math.max(max, s[i - 1][j] + nums[i + j]);
                max = Math.max(max, s[i - 1][j + 1] + nums[j]);
                max = Math.max(max, s[i - 1][j]);
                max = Math.max(max, s[i - 1][j + 1]);
                s[i][j] = max;
            }
        }

        System.out.println(s[nums.length - 1][0]);
    }
}
