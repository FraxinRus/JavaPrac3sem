package ru.mirea.prac2.task5;

public class Dog {
    private String name;
    private int Age;

    public Dog() {
        name = "NN";
        Age = 0;
    }

    public Dog(int Age) {
        name = "NN";
        this.Age=Age;
    }

    public Dog(String name) {
        this.name=name;
        Age = 0;
    }

    public Dog(String name, int Age) {
        this.name=name;
        this.Age=Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int AgeHuman() {
        return (Age*7);
    }

    @Override
    public String toString() {
        return "Имя собаки: "+this.name+",возраст собаки: "+this.Age;
    }
}
