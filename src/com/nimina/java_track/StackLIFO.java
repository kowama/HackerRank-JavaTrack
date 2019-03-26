package com.nimina.java_track;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/26/2019
 * Time: 13:44
 */
public class StackLIFO {
    public static void main(String[] args) {
        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        /* Test each expression for validity */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false");
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
