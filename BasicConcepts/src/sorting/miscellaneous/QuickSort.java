package sorting.miscellaneous;

public class QuickSort {

    public void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    private int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start - 1;
        int j = end + 1;

        do {
            i++;
        } while (arr[i] < pivot);

        do {
            j--;
        } while (arr[j] > pivot);

        if (i >= j)
            return j;

        return 0;

    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 1, 9, 3, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);

        for (int temp : arr) {
            System.out.print(temp + " ");
        }
    }
}

