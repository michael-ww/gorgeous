package mnj.algorithm;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int[] nums = Utility.generate(random.nextInt(17), random.nextInt(100), i % 3 == 0, i % 2 == 0);
            int[] copy = Arrays.copyOf(nums, nums.length);
            new Sort().select(nums);
            Arrays.sort(copy);
            boolean equals = Arrays.equals(nums, copy);
            if (!equals) {
                System.out.println("oppoos");
            }
        }
    }
}
