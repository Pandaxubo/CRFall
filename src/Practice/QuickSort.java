package Practice;

import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(a, low, high);
        quickSort(a, low, pivot - 1);
        quickSort(a, pivot + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = low;
        int index = pivot + 1;
        for (int i = index; i <= high; i++) {
            if (a[i] < a[pivot]) {
                swap(a, i, index);
                index++;
            }

        }
        swap(a, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] a = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
