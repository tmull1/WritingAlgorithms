package org.example;

public class QuickSort {

    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main method to test the quick sort
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.print("Quick Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
