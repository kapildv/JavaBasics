package sorting.miscellaneous;

public class BubbleSort {

    private void sort(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private void printArray(int[] array) {
        int leng = array.length;
        for (int i = 0; i < leng; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        int array[] = {9, 3, 7, 2, 4, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        bubbleSort.printArray(array);

    }
}
