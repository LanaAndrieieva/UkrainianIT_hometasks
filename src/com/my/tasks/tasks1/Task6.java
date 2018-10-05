package com.my.tasks.tasks1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Ввести с консоли n целых чисел. На консоль вывести:
        Четные и нечетные числа*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int nums = scanner.nextInt();
        int[] numsAr = new int[nums];
        System.out.println("Enter your numbers");
        for (int i = 0; i < numsAr.length; i++) {
            numsAr[i] = scanner.nextInt();
        }
        for (int i = 0; i < numsAr.length; i++) {
            if (numsAr[i] % 2 == 0) {
                System.out.println("Even integer " + numsAr[i]);
            } else {
                System.out.println("Odd integer " + numsAr[i]);
            }
        }

        //На консоль вывести наибольшее и наименьшее число
        int min = numsAr[0];
        for (int i = 0; i < numsAr.length; i++) {
            if (min > numsAr[i])
                min = numsAr[i];
        }
        System.out.println("The smallest number is :" + min);
        int max = numsAr[0];
        for (int i = 0; i < numsAr.length; i++) {
            if (max < numsAr[i])
                max = numsAr[i];
        }
        System.out.println("The biggest number is:" + max);

        //Числа, которые делятся на 3 или на 9.
        for (int i = 0; i < numsAr.length; i++){
            if ((numsAr[i] % 3 == 0) || (numsAr[i] % 9 == 0))
            System.out.println("Numbers that are divisible by 3 or 9 are: " + numsAr[i]);
            else System.out.println("No numbers that are divisible by 3 or 9");}

        //Числа, которые делятся на 5 и на 7.
        for (int i = 0; i < numsAr.length; i++){
            if ((numsAr[i] % 5 == 0) && (numsAr[i] % 7 == 0))
            System.out.println("Numbers that are divisible by 5 and 7 are: " + numsAr[i]);
            else System.out.println("No numbers that are divisible by 5 and 7");}

        //Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < numsAr.length; i++)
            if ((numsAr[i] > 99) && (numsAr[i] < 1000)) {
                a = numsAr[i] / 10 / 10;
                b = numsAr[i] / 10 % 10;
                c = numsAr[i] % 100 % 10;
                if (a != b && a != c && b != a && b != c && c != a && c != b)

                    System.out.println("Result: " + numsAr[i]);
            }
        //«Счастливые» числа.
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numsAr.length / 2; i++) {

            sum1 = sum1 + numsAr[i];
            sum2 = sum2 + numsAr[numsAr.length - i - 1];
        }
        if (sum1 == sum2) {
            System.out.print("Lucky because " + sum1 + " is equal to " + sum2);

        } else {
            System.out.print("Ooops, it's not your day");
        }
    }
}

