package gorgeous.algorithm;

// Time Complexity: O(N*logN)
// Space Complexity: O(logN)
public class QuickSort {

    public void process(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        this.process(nums, 0, nums.length - 1);
    }

    public void process(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivotIndex = leftIndex + (int) (Math.random() * (rightIndex - leftIndex + 1));
            int[] pivotIndexes = this.partition(nums, leftIndex, rightIndex, nums[pivotIndex]);
            this.process(nums, leftIndex, pivotIndexes[0] - 1);
            this.process(nums, pivotIndexes[1] + 1, rightIndex);
        }
    }

    public int[] partition(int[] nums, int leftIndex, int rightIndex, int pivot) {
        int cursor = leftIndex;
        while (cursor <= rightIndex) {
            if (nums[cursor] > pivot) {
                Utility.swap(nums, cursor, rightIndex--);
            } else if (nums[cursor] < pivot) {
                Utility.swap(nums, cursor++, leftIndex++);
            } else {
                cursor++;
            }
        }
        return new int[]{leftIndex, rightIndex};
    }
}
