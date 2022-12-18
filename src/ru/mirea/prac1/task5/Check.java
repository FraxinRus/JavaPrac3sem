package ru.mirea.prac1.task5;

public class Check {
    private int N;

    public Check(int N) {
        this.N=N;
    }

    public Check() {
        this.N=0;
    }

    public void work() {
        if(N > 1) {
            int f = 1;
            System.out.printf("%s! = 1",N);
            for (int i = 2; i <= N; ++i) {
                f *= i;
                System.out.printf(" * %s",i);
            }
            System.out.printf(" = %s%n",f);
        }
        else if (N == 0 || N == 1) {
            System.out.printf("%s! = 1%n",N);
        }
        else {
            System.out.println("Факториал меньше 0");
        }
    }
}
