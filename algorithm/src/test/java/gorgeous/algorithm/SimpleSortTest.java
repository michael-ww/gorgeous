package gorgeous.algorithm;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleSortTest {
    @Test
    public void select_validInput_succeed() {
        // given
        int[] nums = Utility.generate(10, 10, false, true);
        int[] copy = Arrays.copyOf(nums, nums.length);

        // when
        new SimpleSort().select(nums);
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
        new SimpleSort().bubble(nums);
        Arrays.sort(copy);

        // then
        Assertions.assertArrayEquals(nums, copy);
    }

    @Test
    public void insert_validInput_succeed() {
        // given
        int[] nums = Utility.generate(10, 10, false, true);
        int[] copy = Arrays.copyOf(nums, nums.length);

        // when
        new SimpleSort().insert(nums);
        Arrays.sort(copy);

        // then
        Assertions.assertArrayEquals(nums, copy);
    }
}
