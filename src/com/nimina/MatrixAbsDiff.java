package com.nimina;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/23/2019
 * Time: 01:06
 */
public class MatrixAbsDiff {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int row = 0; row < arr.length; row++) {
            sumDiag1 += arr[row][row];
            sumDiag2 += arr[row][arr.length - row - 1];
        }
        return Math.abs(sumDiag1 - sumDiag2);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
