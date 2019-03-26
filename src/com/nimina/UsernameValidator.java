package com.nimina;

import java.util.Scanner;

/**
 * Created by kowama
 * Package: com.nimina
 * User: kowama
 * Date: 03/21/2019
 * Time: 17:42
 */
public class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][\\w_]{7,29}$";
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
    }
}
