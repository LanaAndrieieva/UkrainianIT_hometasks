//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
package com.my.tasks.tasks1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password1 = scanner.next();
        String password2 = "password";
        if (password1.equals(password2)) {
            System.out.println("Passwords match");

        }
        else {
            System.out.println("Passwords are different");
        }
    }
}
