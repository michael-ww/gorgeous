package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode894 {
    public List<TreeNode<Integer>> allPossibleFBT(int n) {
        List<TreeNode<Integer>> answer = new ArrayList<>();
        if (n == 1) {
            answer.add(new TreeNode<Integer>(0));
            return answer;
        }
        if (n % 2 == 0) {
            return answer;
        }
        for (int i = 1; i < n; i += 2) {
            for (TreeNode<Integer> left : this.allPossibleFBT(i)) {
                for (TreeNode<Integer> right : this.allPossibleFBT(i)) {
                    answer.add(new TreeNode<>(0, left, right));
                }
            }
        }

        return answer;
    }
}
