package gorgeous.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode206Test {
    @Test
    public void reverseList_validInput_returnHead() {
        // Arrange
        ListNode tail = new ListNode(5, null);
        ListNode fouth = new ListNode(4, tail);
        ListNode third = new ListNode(3, fouth);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);

        // Act
        ListNode answer = new LeetCode206().reverseList(head);

        // Assert
        Assertions.assertEquals(5, answer.value);
    }
}
