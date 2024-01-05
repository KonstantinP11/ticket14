package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 6, 8, 9, 7, 11, 22, 55, 66, 77};
        int[] outArr = new int[5];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            if (i > 1 && i < 7) {
                outArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(outArr));
    }
}
