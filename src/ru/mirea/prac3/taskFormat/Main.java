package ru.mirea.prac3.taskFormat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Convertor A = new Convertor();
        Scanner scanner = new Scanner(System.in);
        String V1 = scanner.nextLine();
        String V2 = scanner.nextLine();
        double N = scanner.nextDouble();
        System.out.println(A.getXtoY(V1,V2,N));
    }
}
