package gorgeous.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode23Test {
    @Test
    public void mergeKLists_validInput_returnHead() {

        // Given
        ListNode ln13 = new ListNode(5);
        ListNode ln12 = new ListNode(4, ln13);
        ListNode ln11 = new ListNode(1, ln12);

        ListNode ln23 = new ListNode(4);
        ListNode ln22 = new ListNode(3, ln23);
        ListNode ln21 = new ListNode(1, ln22);

        ListNode ln32 = new ListNode(6);
        ListNode ln31 = new ListNode(2, ln32);

        ListNode[] listNodes = new ListNode[] { ln11, ln21, ln31 };

        // When
        ListNode answer = new LeetCode23().mergeKLists(listNodes);

        // Then
        Assertions.assertEquals(1, answer.value);
        Assertions.assertEquals(1, answer.next.value);
        Assertions.assertEquals(2, answer.next.next.value);
        Assertions.assertEquals(3, answer.next.next.next.value);
        Assertions.assertEquals(4, answer.next.next.next.next.value);
        Assertions.assertEquals(4, answer.next.next.next.next.next.value);
        Assertions.assertEquals(5, answer.next.next.next.next.next.next.value);
        Assertions.assertEquals(6, answer.next.next.next.next.next.next.next.value);
    }
}
