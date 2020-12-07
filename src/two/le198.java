package two;

public class le198 {
//    public int rob(int[] nums) {
//
//        return robCore(nums, 0);
//    }
//
//    public int robCore(int[] nums, int index) {
//        if (index >= nums.length) {
//            return 0;
//        }
//        if (index == nums.length - 1) {
//            return nums[index];
//        }
//
//        int first = nums[index] + robCore(nums, index + 2);
//        int secd = 0 + robCore(nums, index + 1);
//        return Math.max(first, secd);
//    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] max = new int[nums.length + 1];
        max[0] = 0;
        max[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max[i + 1] = Math.max(max[i], max[i - 1] + nums[i]);
        }
        return max[max.length - 1];
    }
}
