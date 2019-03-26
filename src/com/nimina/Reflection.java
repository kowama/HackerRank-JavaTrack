package com.nimina;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kowama
 * Package: com.nimina.java_track
 * User: kowama
 * Date: 03/26/2019
 * Time: 14:27
 */
public class Reflection {
    public static void main(String[] args) {
        Class student = Student.class; // uses class literal, not a function.
        Method[] methods = student.getDeclaredMethods();

        /* Get names from Methods */
        ArrayList<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        /* Sort and print names */
        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}
