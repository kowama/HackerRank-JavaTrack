package com.nimina.java_track;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 14:21
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] charArr = A.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != charArr[charArr.length - i - 1]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
