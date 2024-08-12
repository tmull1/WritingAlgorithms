package org.example;

import java.util.List;
import java.util.ArrayList;

public class ZAlgorithmSearch {

    // Function to search for the pattern in the text using the Z-algorithm
    public static List<Integer> search(String S, String pat) {
        String concat = pat + "$" + S;
        int l = concat.length();
        int[] Z = new int[l];

        int left = 0, right = 0;
        for (int i = 1; i < l; i++) {
            if (i > right) {
                left = right = i;
                while (right < l && concat.charAt(right) == concat.charAt(right - left)) {
                    right++;
                }
                Z[i] = right - left;
                right--;
            } else {
                int k = i - left;
                if (Z[k] < right - i + 1) {
                    Z[i] = Z[k];
                } else {
                    left = i;
                    while (right < l && concat.charAt(right) == concat.charAt(right - left)) {
                        right++;
                    }
                    Z[i] = right - left;
                    right--;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (Z[i] == pat.length()) {
                result.add(i - pat.length() - 1 + 1); // Convert to 1-based index
            }
        }

        return result;
    }

    // Main method to test the Z-algorithm search
    public static void main(String[] args) {
        String S1 = "batmanandrobinarebat";
        String pat1 = "bat";
        System.out.println("Pattern found at indices: " + search(S1, pat1));

        String S2 = "abesdu";
        String pat2 = "edu";
        System.out.println("Pattern found at indices: " + search(S2, pat2));
    }
}


