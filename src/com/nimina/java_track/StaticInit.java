package com.nimina.java_track;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 13:58
 */
public class StaticInit {
    static Scanner scanner = new Scanner(System.in);
    static int B;
    static int H;
    static boolean flag = true;

    static {
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B < 0 || H < 0 || B>100 || H>100) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive\n");
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
