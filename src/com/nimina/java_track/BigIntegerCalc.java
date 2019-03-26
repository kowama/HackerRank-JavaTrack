package com.nimina.java_track;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/24/2019
 * Time: 21:37
 */
public class BigIntegerCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());
        BigInteger sum = num1.add(num2);
        BigInteger prod = num1.multiply(num2);
        System.out.println(sum + "\n" + prod);

    }
}
