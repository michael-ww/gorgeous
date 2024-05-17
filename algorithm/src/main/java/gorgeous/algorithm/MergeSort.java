package gorgeous.algorithm;

// Time Complexity : O(N*logN)
// Space Complexity: O(N)
public class MergeSort {

    public void process(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        this.process(nums, 0, nums.length - 1);
    }

    private void process(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = leftIndex + ((rightIndex - leftIndex) >> 1);
            this.process(nums, leftIndex, middleIndex);
            this.process(nums, middleIndex + 1, rightIndex);
            this.merge(nums, leftIndex, middleIndex, rightIndex);
        }
    }

    private void merge(int[] nums, int leftIndex, int middleIndex, int rightIndex) {
        int[] orderArray = new int[rightIndex - leftIndex + 1];
        int left = leftIndex, right = middleIndex + 1, orderArrayIndex = 0;
        while (left <= middleIndex && right <= rightIndex) {
            orderArray[orderArrayIndex++] = nums[left] <= nums[right] ? nums[left++] : nums[right++];
        }
        while (left <= middleIndex) {
            orderArray[orderArrayIndex++] = nums[left++];
        }
        while (right <= rightIndex) {
            orderArray[orderArrayIndex++] = nums[right++];
        }
        System.arraycopy(orderArray, 0, nums, leftIndex, orderArray.length);
    }
}
