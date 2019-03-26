package com.nimina;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/24/2019
 * Time: 21:48
 */
public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if (new BigInteger(num).isProbablePrime(100))
            System.out.println("prime");
        else
            System.out.println("not prime");

    }
}
