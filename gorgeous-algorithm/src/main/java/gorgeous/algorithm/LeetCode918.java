package gorgeous.algorithm;

public class LeetCode918 {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums == null) {
            throw new NullPointerException();
        }
        if (nums.length <= 0) {
            return 0;
        }
        int all = nums[0], maxSum = nums[0], minSum = nums[0];
        for (int i = 1, maxSumPrevious = nums[0], minSumPrevious = nums[0]; i < nums.length; i++) {
            all += nums[i];
            maxSumPrevious = Math.max(nums[i], nums[i] + maxSumPrevious);
            maxSum = Math.max(maxSum, maxSumPrevious);
            minSumPrevious = Math.min(nums[i], nums[i] + minSumPrevious);
            minSum = Math.min(maxSum, minSumPrevious);
        }

        return all == minSum ? maxSum : Math.max(maxSum, all - minSum);
    }
}
