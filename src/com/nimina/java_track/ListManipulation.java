package com.nimina.java_track;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/26/2019
 * Time: 12:22
 */
public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            scanner.nextLine();
            if (scanner.nextLine().equals("Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else {
                list.remove(scanner.nextInt());
            }
        }
        for (int item : list) {
            System.out.print(item + " ");
        }

    }
}
