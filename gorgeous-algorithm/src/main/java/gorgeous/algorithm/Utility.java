package gorgeous.algorithm;

import java.util.HashSet;
import java.util.Random;

public class Utility {

    public static void swap(int[] array, int i, int j) {
        if (array == null || array.length <= 0 || i >= array.length || j >= array.length) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
            } while (distinct && hashSet.contains(num));
            hashSet.add(num);
            answer[i] = num;
        }
        return answer;
    }

    public static <T extends Comparable<T>> ListNode<T> reverse(ListNode<T> head) {
        if (head == null || head.getNext() != null) {
            return head;
        }
        ListNode<T> current = head, previous = null, next;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void reverse(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            Utility.swap(array, startIndex++, endIndex--);
        }
    }
}