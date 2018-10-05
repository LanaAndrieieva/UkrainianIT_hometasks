//1. Приветствовать любого пользователя при вводе его имени через командную строку.
package com.my.tasks.tasks1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        while (name.isEmpty()){
            System.out.println("Enter your name again");
            name = scanner.nextLine();
        }
        System.out.println("Hi there "+name);
        scanner.close();
    }
}
