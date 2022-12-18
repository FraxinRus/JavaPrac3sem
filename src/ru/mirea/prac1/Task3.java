package ru.mirea.prac1;

public class Task3 {
    public static void main(String[] args) {
        System.out.printf("Количество аргументов: %s %n",args.length);
        for (int i = 0; i < args.length; ++i) {
            System.out.printf("Аргументы: %s %s %n",i,args[i]);
        }
    }
}