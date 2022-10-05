package ru.itmo.homeworks.hw6.task3.enemies;

public class Animals {
    public String name;
    public int catSpeed;
    public int mouseSpeed;
    public int weight;
    public int catchMouses;

    public Animals(String name, int speed, int mSpeed, int weight, int catchMouses) {
        this.name = name;
        this.catSpeed = speed;
        this.mouseSpeed = mSpeed;
        this.weight = weight;
        this.catchMouses = catchMouses;

    }

    public void showInfo() {
        System.out.println
                ("Имя:" + name + "\n" + "Скорость: " + catSpeed + "\n" + "Вес: " + weight + "\n" + "Поймано мышей: " + catchMouses);
    }
}
