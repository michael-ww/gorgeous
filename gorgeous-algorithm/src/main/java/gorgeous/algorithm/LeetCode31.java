package gorgeous.algorithm;

public class LeetCode31 {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int i = nums.length - 2, j = nums.length - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }

        if (i >= 0) {
            int k = nums.length - 1;
            while (k >= 0 && nums[i] >= nums[k]) {
                k--;
            }
            Utility.swap(nums, i, k);
        }
        Utility.reverse(nums, i + 1, nums.length - 1);
    }
}
