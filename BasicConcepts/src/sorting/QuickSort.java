package sorting;

public class QuickSort {

    private void quickSort(int arr[], int start, int end) {

        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }

    private int partition(int arr[], int start, int end) {

        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return (i + 1);
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
