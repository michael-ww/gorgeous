package gorgeous.spring.service;

public class CacheLinePadding {

    private static class Padding {

        public volatile long p1, p2, p3, p4, p5, p6, p7;
        public volatile long X = 0L;
        public volatile long p8, p9, p10, p11, p12, p13, p14;
    }

    public static Padding[] paddingArray = new Padding[2];

    static {
        paddingArray[0] = new Padding();
        paddingArray[1] = new Padding();
    }

    public static void main(String[] args) {
        try {
            long testTimes = 100000000L;

            Thread thread1 = new Thread(()-> {
                for (long i = 0L; i < testTimes; i++) {
                    paddingArray[0].X = i;
                }
            });

            Thread thread2 = new Thread(() -> {
                for (long i = 0L; i < testTimes; i++) {
                    paddingArray[1].X = i;
                }
            });

            final long startPadding = System.nanoTime();
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println("Padding : " + (System.nanoTime() - startPadding) / 1000000);
        } catch (InterruptedException e) {
        }
    }
}
