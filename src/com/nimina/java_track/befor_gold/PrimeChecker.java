package com.nimina.java_track.befor_gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/21/2019
 * Time: 17:52
 */

class Prime {
    //    void checkPrime(int... numbers) {
//        for (int num : numbers) {
//            if (num > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
//                    .noneMatch(n -> (num % n == 0))) {
//                System.out.println(num + " ");
//
//            }
//        }
//
//    }
     void checkPrime(int... numbers) {
        for (int number : numbers) {
            BigInteger bigInt = BigInteger.valueOf(number);
            if (bigInt.isProbablePrime(100)) {
                System.out.print(number + " ");
            }
        }


    }

}

public class PrimeChecker {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
