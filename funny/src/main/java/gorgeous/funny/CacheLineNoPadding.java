package gorgeous.funny;

public class CacheLineNoPadding {

    private static class NoPadding {

        private volatile long X = 0L;
    }

    public static NoPadding[] noPaddingArray = new NoPadding[2];

    static {
        noPaddingArray[0] = new NoPadding();
        noPaddingArray[1] = new NoPadding();
    }

    public static void main(String[] args) {
        try {
            long testTimes = 100000000L;

            Thread thread1 = new Thread(() -> {
                for (long i = 0L; i < testTimes; i++) {
                    noPaddingArray[0].X = i;
                }
            });

            Thread thread2 = new Thread(() -> {
                for (long i = 0L; i < testTimes; i++) {
                    noPaddingArray[1].X = i;
                }
            });

            final long start = System.nanoTime();
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println((System.nanoTime() - start) / 1000000);
        } catch (InterruptedException e) {
        }
    }
}
