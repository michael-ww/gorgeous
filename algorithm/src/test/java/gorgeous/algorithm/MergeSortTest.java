package gorgeous.algorithm;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    @Test
    public void process_validInput_succeed() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // given
            int[] nums = Utility.generate(random.nextInt(i + 1) + 1, random.nextInt(i + 1) + 10, false, true);
            int[] copy = Arrays.copyOf(nums, nums.length);

            // when
            new MergeSort().process(nums);
            Arrays.sort(copy);

            // then
            Assertions.assertArrayEquals(nums, copy);
        }
    }
}
