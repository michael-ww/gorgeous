package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode145Test {

    @Test
    public void postorderTraversal_validInput_ReturnList() {
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
        LeetCode145 leetCode145 = new LeetCode145();
        List<Integer> answer1 = leetCode145.postorderTraversal1(one);
        List<Integer> answer2 = leetCode145.postorderTraversal2(one);
        List<Integer> answer3 = leetCode145.postorderTraversal3(one);

        // Then
        List<Integer> expected = new ArrayList<>();
        expected.add(4); // { 4, 5, 2, 6, 7, 3, 1 };
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(7);
        expected.add(3);
        expected.add(1);
        Assertions.assertEquals(expected, answer1);
        Assertions.assertEquals(expected, answer2);
        Assertions.assertEquals(expected, answer3);
    }
}
