package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if (nums == null || nums.length <= 0) {
            return answer;
        }
        Arrays.sort(nums);
        this.backtrack(nums, 0, answer);
        return answer;
    }

    private void backtrack(int[] nums, int index, List<List<Integer>> answer) {
        if (index >= nums.length) {
            answer.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
            return;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                continue;
            }
            hashSet.add(nums[i]);
            Utility.swap(nums, i, index);
            this.backtrack(nums, index + 1, answer);
            Utility.swap(nums, i, index);
        }
    }
}
