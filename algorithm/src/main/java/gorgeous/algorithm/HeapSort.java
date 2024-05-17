package gorgeous.algorithm;

// Time Complexity : O(N*logN)
// Space Complexity: O(1)
public class HeapSort {

    public void process(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            this.heapInsert(nums, i);
        }
        int heapSize = nums.length;
        while (heapSize > 0) {
            Utility.swap(nums, 0, --heapSize);
            this.heapify(nums, 0, heapSize);
        }
    }

    private void heapInsert(int[] nums, int index) {
        while (nums[index] > nums[(index - 1) / 2]) {
            Utility.swap(nums, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private void heapify(int[] nums, int index, int heapSize) {
        int leftIndex = index * 2 + 1;
        while (leftIndex < heapSize) {
            int largest = leftIndex + 1 < heapSize && nums[leftIndex + 1] > nums[leftIndex] ? leftIndex + 1 : leftIndex;
            largest = nums[largest] > nums[index] ? largest : index;
            if (largest == index) {
                break;
            }
            Utility.swap(nums, index, largest);
            index = largest;
            leftIndex = index * 2 + 1;
        }
    }
}
