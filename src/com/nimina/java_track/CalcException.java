package com.nimina.java_track;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/25/2019
 * Time: 11:03
 */
class MCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");

        if (n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");

        return (long) Math.pow(n, p);

    }
}

class CalcException {
    public static final MCalculator my_calculator = new MCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}