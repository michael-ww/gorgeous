package gorgeous.algorithm;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode answer = new ListNode(0);
        ListNode current = answer;
        int carryNumber = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.value;
            int y = l2 == null ? 0 : l2.value;
            int z = x + y + carryNumber;
            current.next = new ListNode(z % 10);
            carryNumber = z / 10;
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carryNumber > 0) {
            current.next = new ListNode(carryNumber);
        }
        return answer.next;
    }
}