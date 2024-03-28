package mnj.algorithm;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void select_validInput_succeed() {
        // given
        int[] nums = Utility.generate(10, 10, false, true);
        int[] copy = Arrays.copyOf(nums, nums.length);

        // when
        new Sort().select(nums);
        Arrays.sort(copy);

        // then
        Assertions.assertArrayEquals(nums, copy);
    }

    @Test
    public void bubble_validInput_succeed() {
        // given
        int[] nums = Utility.generate(10, 10, false, true);
        int[] copy = Arrays.copyOf(nums, nums.length);

        // when
        new Sort().bubble(nums);
        Arrays.sort(copy);

        // then
        Assertions.assertArrayEquals(nums, copy);
    }
}
