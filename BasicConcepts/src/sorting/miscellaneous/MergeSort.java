package sorting.miscellaneous;

import javafx.scene.SubScene;

public class MergeSort {

    private void merge(int arr[], int l, int mid, int r) {

        int i, j, k;
        int len1 = mid - l + 1;
        int len2 = r - mid;

        int[] L = new int[len1];
        int[] R = new int[len2];

        for (i = 0; i < len1; i++) {
            L[i] = arr[l + i];
        }
        for (j = 0; j < len2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;

        while (i < len1 && j < len2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            } else {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        while (i < len1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < len2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    private void sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sort(arr, 0, mid);
            sort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private void printArray(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 3, 7, 2, 4, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        mergeSort.printArray(array);
    }
}
