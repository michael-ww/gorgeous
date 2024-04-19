package gorgeous.algorithm;

public class LeetCode160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode loopA = this.getLoopNode(headA);
        ListNode loopB = this.getLoopNode(headB);
        if (loopA == null && loopB == null) {
            return this.getNoLoopIntersectionNode(headA, headB);
        } else if (loopA != null && loopB != null) {
            return this.getBothLoopIntersectionNode(headA, loopA, headB, loopB);
        } else {
            return null;
        }
    }

    private ListNode getLoopNode(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }

        ListNode fast = head.next.next, slow = head.next;
        while (fast != slow) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    private ListNode getNoLoopIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        int nodeCount = 0;
        while (currentA.next != null) {
            nodeCount++;
            currentA = currentA.next;
        }

        ListNode currentB = headB;
        while (currentB.next != null) {
            nodeCount--;
            currentB = currentB.next;
        }

        if (currentA != currentB) {
            return null;
        }

        ListNode longlst = nodeCount > 0 ? headA : headB;
        ListNode shortlst = longlst == headA ? headB : headA;
        nodeCount = Math.abs(nodeCount);
        while (nodeCount > 0) {
            nodeCount--;
            longlst = longlst.next;
        }

        while (longlst != shortlst) {
            longlst = longlst.next;
            shortlst = shortlst.next;
        }

        return longlst;
    }

    private ListNode getBothLoopIntersectionNode(ListNode headA, ListNode loopA, ListNode headB, ListNode loopB) {
        if (loopA == loopB) {
            ListNode currentA = headA;
            int nodeCount = 0;
            while (currentA != loopA) {
                nodeCount++;
                currentA = currentA.next;
            }
            ListNode currentB = headB;
            while (currentB != loopB) {
                nodeCount--;
                currentB = currentB.next;
            }
            ListNode longlst = nodeCount > 0 ? headA : headB;
            ListNode shortlst = longlst == headA ? headB : headA;
            nodeCount = Math.abs(nodeCount);
            while (nodeCount > 0) {
                nodeCount--;
                longlst = longlst.next;
            }
            while (longlst != shortlst) {
                longlst = longlst.next;
                shortlst = shortlst.next;
            }
            return longlst;
        } else {
            ListNode currentA = loopA.next;
            while (currentA != loopA) {
                if (currentA == loopB) {
                    return loopA;
                }
                currentA = currentA.next;
            }
            return null;
        }
    }
}
