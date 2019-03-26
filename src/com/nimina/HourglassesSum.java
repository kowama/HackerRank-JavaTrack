package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/25/2019
 * Time: 09:54
 */
public class HourglassesSum {
    private static final Scanner scanner = new Scanner(System.in);

    static int findMaxSum(int[][] mat) {
        //mat is supose to be squared
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length - 2; i++) {
            for (int j = 0; j < mat.length - 2; j++) {
                // Considering mat[i][j] as top
                // left cell of hour glass.
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(findMaxSum(arr));

        scanner.close();


    }
}
