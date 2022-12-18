package ru.mirea.prac2.task8;

public class Main {
    public static void main(String[] args) {
        String[] A;
        A = new String[5];
        A[0] = "abc";
        A[1] = "def";
        A[2] = "ghi";
        A[3] = "jkl";
        A[4] = "mno";
        A = swapString(5, A);
        System.out.printf("%s %s %s %s %s", A[0],A[1],A[2],A[3],A[4]);
    }
    public static String[] swapString(int n,String[] a) {
        String x;
        for (int i = 0; i < (n/2); ++i) {
            x = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = x;
        }
        return a;
    }
}
