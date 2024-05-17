package gorgeous.algorithm;

public class LeetCode136 {

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return Integer.MIN_VALUE;
        }

        int eor = 0;
        for (int num : nums) {
            eor ^= num;
        }

        return eor;
    }
}
