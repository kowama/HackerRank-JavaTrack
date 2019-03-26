package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/25/2019
 * Time: 10:24
 */
public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int negativeSumCount = 0;
        //sub arr of size k
        for (int k = 1; k <= array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                if (i + k <= array.length) {
                    int currSum = 0;

                    for (int j = i; j < i + k; j++) {
                        currSum += array[j];
                    }
                    if (currSum < 0) {
                        negativeSumCount++;
                    }
                }

            }
        }
        System.out.println(negativeSumCount);
    }
}
