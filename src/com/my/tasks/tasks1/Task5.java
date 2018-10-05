//Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
package com.my.tasks.tasks1;

public class Task5 {
    public static void main(String[] args) throws NumberFormatException{
        int sum = 0;
        int pr = 1;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            sum = sum + a;
            pr = pr * a;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + pr);
    }
}

