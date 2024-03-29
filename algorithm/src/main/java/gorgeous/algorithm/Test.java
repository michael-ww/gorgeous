package gorgeous.algorithm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // given
            int[] nums = Utility.generate(random.nextInt(i + 1) + 1, random.nextInt(i + 10) + 1, false, true);
            int[] copy = Arrays.copyOf(nums, nums.length);

            // when
            new MergeSort().process(nums);
            Arrays.sort(copy);

            // then
            if (!Arrays.equals(nums, copy)) {
                System.out.println("oppoos");
            }
        }
        // Random random = new Random();
        // for (int i = 0; i < 10; i++) {
        // int[] nums = Utility.generate(random.nextInt(17), random.nextInt(100), i % 3
        // == 0, i % 2 == 0);
        // int[] copy = Arrays.copyOf(nums, nums.length);
        // new SimpleSort().select(nums);
        // Arrays.sort(copy);
        // boolean equals = Arrays.equals(nums, copy);
        // if (!equals) {
        // System.out.println("oppoos");
        // }
        // }
    }
}
