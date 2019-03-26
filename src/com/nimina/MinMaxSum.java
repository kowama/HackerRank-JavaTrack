package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/23/2019
 * Time: 00:22
 */
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long[] sumArr = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sumArr[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    sumArr[i] += arr[j];
                }
            }
        }
        long sumMin = sumArr[0], sumMax = sumArr[0];
        for (var sum : sumArr) {
            if (sum > sumMax) {
                sumMax = sum;
            }
            if (sum < sumMin) {
                sumMax = sum;
            }
        }

        System.out.println(sumMin + " " + sumMax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
