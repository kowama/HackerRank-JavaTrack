package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 13:39
 */
public class ScannerEOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (sc.hasNext()) {
            index++;
            System.out.println(index + " " + sc.nextLine());
        }
    }
}
