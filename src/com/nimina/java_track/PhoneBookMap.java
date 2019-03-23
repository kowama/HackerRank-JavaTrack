package com.nimina.java_track;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/23/2019
 * Time: 16:22
 */

//Complete this code or write your own from scratch
class PhoneBookMap {
    public static void main(String[] argh) {
        Map<String, Integer> contacts = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            contacts.putIfAbsent(name, phone);
        }
        while (in.hasNext()) {

            try {
                String s = in.nextLine();
                int number = contacts.get(s);
                System.out.println(s + "=" + number);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }


        }
    }
}



