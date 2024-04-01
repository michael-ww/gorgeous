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
            int randomIndex = leftIndex + (int) (Math.random() * (rightIndex - leftIndex + 1));
            Utility.swap(nums, rightIndex, randomIndex);
            int[] middleIndexes = this.partition(nums, leftIndex, rightIndex);
            this.process(nums, leftIndex, middleIndexes[0] - 1);
            this.process(nums, middleIndexes[1] + 1, rightIndex);
        }
    }

    public int[] partition(int[] nums, int leftIndex, int rightIndex) {
        int lessIndex = leftIndex - 1, moreIndex = rightIndex;
        while (leftIndex < moreIndex) {
            if (nums[leftIndex] > nums[rightIndex]) {
                Utility.swap(nums, --moreIndex, leftIndex);
            } else if (nums[leftIndex] < nums[rightIndex]) {
                Utility.swap(nums, ++lessIndex, leftIndex++);
            } else {
                leftIndex++;
            }
        }
        Utility.swap(nums, moreIndex, rightIndex);
        return new int[] { lessIndex + 1, moreIndex };
    }
}
