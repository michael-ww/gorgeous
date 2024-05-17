package gorgeous.algorithm;

public class LeetCode21 {

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = null;
        dummy.next = current;
        while (list1 != null || list2 != null) {
            if (list1 == null || (list2 != null && list1.value < list2.value)) {
                current = list2;
                list2 = list2.next;
            } else {
                current = list1;
                list1 = list1.next;
            }
            current = current.next;
        }

        return dummy.next;
    }

    public ListNode mergeTowListNode2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
            if (list1.value > list2.value) {
                list2.next = this.mergeTowListNode2(list1, list2.next);
                return list2;
            } else {
                list1.next = this.mergeTowListNode2(list1.next, list2);
                return list1;
            }
        }
    }
}
