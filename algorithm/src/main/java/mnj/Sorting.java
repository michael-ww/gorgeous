package mnj;

public class Sorting {

    public void insertionSorting(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = array[j];
                }
            }
        }
    }

    public void selectionSorting(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }
        
    }
}
