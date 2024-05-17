package gorgeous.algorithm;

public class SimpleSort {

    public void select(int[] nums) {
        if (nums == null || nums.length < 1) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                minValueIndex = nums[minValueIndex] > nums[j] ? j : minValueIndex;
            }
            Utility.swap(nums, i, minValueIndex);
        }
    }

    public void bubble(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    Utility.swap(nums, j, j + 1);
                }
            }

        }
    }

    public void insert(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[j + 1]) {
                    Utility.swap(nums, j, j + 1);
                }
            }
        }
    }
}
