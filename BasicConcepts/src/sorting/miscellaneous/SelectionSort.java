package sorting.miscellaneous;

public class SelectionSort {

    private void sort(int array[]) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[min] > array[j])
                    min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }


    }

    private void printArray(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int array[] = {9, 3, 7, 2, 4, 1};

        selectionSort.sort(array);
        selectionSort.printArray(array);

    }
}
