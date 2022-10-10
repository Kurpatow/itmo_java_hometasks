package ru.itmo.homeworks.hw6.task3;

public class Main {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse(6);
        Mouse mouse2 = new Mouse(7);
        Mouse mouse3 = new Mouse(9);

        Cat valera = new Cat("Валера", 6, 4);
        Cat grigoriy = new Cat("Григорий", 10, 7);

        grigoriy.catchingMouse(mouse1);
        grigoriy.catchingMouse(mouse2);
        grigoriy.catchingMouse(mouse3);

        grigoriy.printMouses();
        valera.printMouses();

        grigoriy.attackAnotherCat(valera);

    }
}
