package gorgeous.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode98Test {
    @Test
    public void isValidBST1_validInput_returnBoolean() {
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
        boolean answer1 = new LeetCode98().isValidBST1(one);
        boolean answer2 = new LeetCode98().isValidBST2(one);
        boolean answer3 = new LeetCode98().isValidBST3(one);

        // Than
        Assertions.assertFalse(answer1);
        Assertions.assertFalse(answer2);
        Assertions.assertFalse(answer3);
    }

    @Test
    public void isValidBST2_validInput_returnBoolean() {
        // Given
        TreeNode seven = new TreeNode(7);
        TreeNode six = new TreeNode(5);
        TreeNode five = new TreeNode(3);
        TreeNode four = new TreeNode(1);
        TreeNode three = new TreeNode(6);
        three.left = six;
        three.right = seven;
        TreeNode two = new TreeNode(2);
        two.left = four;
        two.right = five;
        TreeNode one = new TreeNode(4);
        one.left = two;
        one.right = three;

        // When
        boolean answer = new LeetCode98().isValidBST1(one);

        // Than
        Assertions.assertTrue(answer);

    }

}
