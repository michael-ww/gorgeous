package mnj;

public class Algorithm {

    public static void main(String[] args) {

    }

    private static void FindOddNumber(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        int eor = 0;
        for (int current : array) {
            eor ^= current;
        }

        int rightOne = eor & (~eor + 1);
    }
}
