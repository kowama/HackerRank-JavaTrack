package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/22/2019
 * Time: 12:31
 */
public class StdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}
