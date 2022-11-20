package ru.itmo.homeworks.hw06.task3;

public class Main {
    public static void main(String[] args) {

        Mouse1 mouse1 = new Mouse1(6);
        Mouse1 mouse2 = new Mouse1(7);
        Mouse1 mouse3 = new Mouse1(9);

        Cat valera = new Cat ("Валера", 6, 4);
        Cat grigoriy = new Cat ("Григорий", 10, 8);

        grigoriy.catchingMouse(mouse1);
        grigoriy.catchingMouse(mouse2);
        grigoriy.catchingMouse(mouse3);

        grigoriy.printMouses();
        valera.printMouses();

        grigoriy.attackAnotherCat(valera);
    }
}
