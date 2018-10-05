//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
package com.my.tasks.tasks1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int nums = scanner.nextInt();
        int[] numsAr = new int[nums];
        System.out.println("Enter your numbers");
        for (int i = 0; i < numsAr.length; i++) {
            numsAr[i] = scanner.nextInt();
        }
        //int[] nums = {1, 4, 5, 2, 1};
        for (int i : numsAr
                ) {
            System.out.println(i);
        }
        for (int i2 : numsAr
                ) {
            System.out.print(i2);
        }
    }
}
