package sorting;

public class InsertionSort {

    private void insertionSort(int array[]) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    private void printSortedArray(int array[]) {
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        insertionSort.insertionSort(arr);
        insertionSort.printSortedArray(arr);
    }

}
