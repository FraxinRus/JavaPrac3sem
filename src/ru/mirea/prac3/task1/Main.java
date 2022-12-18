package ru.mirea.prac3.task1;

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] A = new double[5];
        double[] B = new double[5];
        Random random = new Random();
        for (int i = 0; i < 5; ++i) {
            A[i] = (double)(Math.random()*10);
            System.out.printf("Math [%s]: %.4s%n",i,A[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; ++i) {
            B[i] = random.nextDouble(10-0);
            System.out.printf("Random [%s]: %.4s%n",i,B[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; ++i) {
            System.out.printf("Math [%s]: %.4s%n",i,A[i]);
        }
        System.out.println();
        for (int i = 0; i < 5; ++i) {
            System.out.printf("Random [%s]: %.4s%n",i,B[i]);
        }
    }
}
