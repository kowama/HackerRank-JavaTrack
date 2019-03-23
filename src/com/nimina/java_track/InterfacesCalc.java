package com.nimina.java_track;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 12:34
 */

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        return IntStream.rangeClosed(1, n).filter((int a) -> n % a == 0).sum();
    }
}

public class InterfacesCalc {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}