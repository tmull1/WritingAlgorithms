package org.example;

public class CountingSort {

    // Function to perform counting sort on a string
    public static String countSort(String arr) {
        int[] count = new int[26]; // Since there are 26 lowercase English letters

        // Step 1: Count the occurrences of each character in the string
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Step 2: Reconstruct the sorted string
        StringBuilder sortedString = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sortedString.toString();
    }

    // Main method to test the counting sort
    public static void main(String[] args) {
        String input1 = "edsab";
        System.out.println("Sorted string 1: " + countSort(input1));

        String input2 = "geeksforgeeks";
        System.out.println("Sorted string 2: " + countSort(input2));
    }
}

