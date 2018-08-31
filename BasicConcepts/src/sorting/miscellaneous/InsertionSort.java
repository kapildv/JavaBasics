package sorting.miscellaneous;

public class InsertionSort {
    private void sort(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {

            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    private void printArray(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int array[] = {9, 3, 7, 2, 4, 1};
        insertionSort.sort(array);
        insertionSort.printArray(array);
    }
}
