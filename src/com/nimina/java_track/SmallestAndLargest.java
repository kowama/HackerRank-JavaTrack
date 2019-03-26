package com.nimina.java_track;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 17:21
 */
public class SmallestAndLargest {
    public static String getSmallestAndLargest(String s, int k) {

        //max number of substr of length k
        String[] subStringArr = new String[s.length() - k + 1];

        for (int i = 0; i < subStringArr.length; i++) {
            subStringArr[i] = s.substring(i, i + k);
        }

        String smallest = subStringArr[0];
        String largest = subStringArr[0];

        for (String subString : subStringArr) {
            if (subString.compareTo(smallest) < 1) {
                smallest = subString;
            }
            if (subString.compareTo(largest) > 1) {
                largest = subString;
            }

        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
