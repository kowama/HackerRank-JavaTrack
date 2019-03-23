package com.nimina.java_track;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track.befor_gold
 * User: kowama
 * Date: 03/23/2019
 * Time: 01:45
 */
public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            System.out.println(extractTagFrom(line));

            testCases--;
        }
    }

    private static boolean validateContentTag() {
        return false;

    }

    private static String extractTagFrom(String line) {
        String[] contentLines = line.split("<[^>]*>");
        return line.split("<[^>]*>")[0];
    }
}
