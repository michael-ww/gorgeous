package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode94Test {

    @Test
    public void inorderTraversal_validInput_returnList() {
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
        LeetCode94 leetCode94 = new LeetCode94();
        List<Integer> answer1 = leetCode94.inorderTraversal1(one);
        List<Integer> answer2 = leetCode94.inorderTraversal2(one);
        List<Integer> answer3 = leetCode94.inorderTraversal3(one);

        // Then
        List<Integer> expected = new ArrayList<>();
        expected.add(4); // { 4, 5, 2, 6, 7, 3, 1 };
        expected.add(2);
        expected.add(5);
        expected.add(1);
        expected.add(6);
        expected.add(3);
        expected.add(7);
        Assertions.assertEquals(expected, answer1);
        Assertions.assertEquals(expected, answer2);
        Assertions.assertEquals(expected, answer3);
    }
}
