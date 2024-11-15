package gorgeous.algorithm;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeapSortTest {

    @Test
    public void process_validInput_succeed() {
        for (int i = 0; i < 100; i++) {
            // given
            int[] nums = Utility.generate(i + 1, (int) Math.ceil(Math.random() * 10), false, true);
            int[] copy = Arrays.copyOf(nums, nums.length);

            // when
            new HeapSort().process(nums);
            Arrays.sort(copy);

            // then
            Assertions.assertArrayEquals(nums, copy);
        }
    }
}
