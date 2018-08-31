package sorting;

public class BubbleSort {

    private void bubbleSort(int array[]) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printSortedArray(int array[]) {

        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {9, 3, 7, 2, 4, 1};
        bubbleSort.bubbleSort(array);
        bubbleSort.printSortedArray(array);
    }

}
