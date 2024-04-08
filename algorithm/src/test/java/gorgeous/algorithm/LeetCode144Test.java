package gorgeous.algorithm;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LeetCode144Test {
    @Test
    public void preorderTraversal_validInput_returnArray() {
        // Given
        TreeNode seven = new TreeNode(7);
        TreeNode six = new TreeNode(6);
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        three.left = six;
        three.right = seven;
        TreeNode two = new TreeNode(2);
        two.left = four;
        two.right = five;
        TreeNode one = new TreeNode(1);
        one.left = two;
        one.right = three;

        // When
        LeetCode144 leetCode144 = new LeetCode144();
        List<Integer> answer1 = leetCode144.preorderTraversal1(one);
        List<Integer> answer2 = leetCode144.preorderTraversal2(one);
        List<Integer> answer3 = leetCode144.preorderTraversal3(one);

        // Then
        List<Integer> expected = new ArrayList<>();
        expected.add(1); // { 4, 5, 2, 6, 7, 3, 1 };
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(3);
        expected.add(6);
        expected.add(7);
        Assertions.assertEquals(expected, answer1);
        Assertions.assertEquals(expected, answer2);
        Assertions.assertEquals(expected, answer3);
    }
}
