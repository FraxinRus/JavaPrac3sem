package ru.mirea.prac1.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = scanner.nextInt();
        Check A = new Check(N);
        A.work();
    }
}
