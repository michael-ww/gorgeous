package gorgeous.algorithm;

import java.util.HashSet;
import java.util.Random;

public class Utility {
    public static void swap(int[] nums, int i, int j) {
        if (nums == null || nums.length <= 0 || i >= nums.length || j >= nums.length) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int[] generate(int length, int maxValue, boolean distinct, boolean includeNegative) {
        int[] answer = new int[length];
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < answer.length; i++) {
            int num;
            do {
                num = new Random().nextInt(maxValue);
                if (includeNegative && i % 3 == 0) {
                    num = -num;
                }
            } while (distinct && hashSet.contains(Integer.valueOf(num)));
            hashSet.add(Integer.valueOf(num));
            answer[i] = num;
        }
        return answer;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next != null) {
            return head;
        }
        ListNode current = head, previous = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
