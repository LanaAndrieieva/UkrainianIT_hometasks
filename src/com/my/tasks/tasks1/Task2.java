//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
package com.my.tasks.tasks1;

public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length-1; i >=0 ; i--) {
            System.out.println("Reversed arguments: "+args[i]);

        }
    }
}
