package two;

public class le152 {
    public int maxProduct(int[] nums) {
        int left = 0;
        int right = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            left = (left == 0) ? 1 * nums[i] : left * nums[i];
            right = (right == 0) ? 1 * nums[nums.length - 1 - i] : right * nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(left, right));
        }
        return max;
    }
}
