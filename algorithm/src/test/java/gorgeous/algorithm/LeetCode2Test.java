package gorgeous.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode2Test {
    @Test
    public void addTwoNumbers_validInput_returnHead() {
                    //Arrange
            ListNode l11 = new ListNode(6, null);
            ListNode l1 = new ListNode(9, l11);
            ListNode l22 = new ListNode(5, null);
            ListNode l2 = new ListNode(2, l22);

            //Act
            ListNode result = new LeetCode2().addTwoNumbers(l1, l2);

            //Assert
            Assertions.assertEquals(1, result.value);
            Assertions.assertEquals(2, result.next.value);
            Assertions.assertEquals(1, result.next.next.value);
            Assertions.assertNull(result.next.next.next);
    }
}
