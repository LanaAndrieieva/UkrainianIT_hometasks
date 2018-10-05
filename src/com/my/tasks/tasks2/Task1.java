//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
package com.my.tasks.tasks2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array size");
        int digit = scanner.nextInt();
        String[] arrayDigits = new String[digit];
        System.out.println("enter digits");
        for (int i = 0; i < arrayDigits.length; i++) {
            arrayDigits[i] = Integer.toString(scanner.nextInt());
        }
        Arrays.sort(arrayDigits, (a, b) -> Integer.compare(a.length(), b.length()));
        String min = arrayDigits[0];
        int countmin = min.length();
        String max = arrayDigits[digit-1];
        int countmax = max.length();
        System.out.println("Your numbers are " + Arrays.toString(arrayDigits));
        System.out.println("The shortest number is " + min);
        System.out.println("Amount of digits in it is " + countmin);
        System.out.println("The longest number is " + max);
        System.out.println("Amount of digits in it is " + countmax);
    }
}