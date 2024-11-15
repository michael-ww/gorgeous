package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if (nums == null || nums.length <= 0) {
            return answer;
        }
        this.backtrack(nums, 0, answer);
        return answer;
    }

    private void backtrack(int[] nums, int index, List<List<Integer>> answer) {
        if (index >= nums.length) {
            answer.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        } else {
            for (int i = index; i < nums.length; i++) {
                Utility.swap(nums, i, index);
                this.backtrack(nums, index + 1, answer);
                Utility.swap(nums, i, index);
            }
        }
    }
}