package org.example;

public class BubbleSort {

    // Function to perform bubble sort on the array
    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;

        bubbleSort(arr, n);

        // Print the sorted array
        System.out.print("Bubble Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

