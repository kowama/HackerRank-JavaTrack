package com.nimina.java_track;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 16:09
 */
public class RegexPatern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern r = Pattern.compile(pattern);
                System.out.println("Valid");

            }catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }


    }
}
