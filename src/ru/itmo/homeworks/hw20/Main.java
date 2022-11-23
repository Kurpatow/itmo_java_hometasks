package ru.itmo.homeworks.hw20;

import ru.itmo.homeworks.hw20.units.Infantry;
import ru.itmo.homeworks.hw20.units.King;


public class Main {

    public void finalArgs(final int a, final Infantry infantry){
        System.out.println(a);
        int b = a * a;
        System.out.println(infantry.getHealthPoint());
        infantry.plusHealth(10);
    }

    public static void main(String[] args) {
        King king01 = new King(1000);
        King king02 = new King(2000);

        king01.createArmy();
        king02.createArmy();

        Kingdom kingdom01 = new Kingdom("Королевство 1.");
        kingdom01.setKing(king01);
        Kingdom kingdom02 = new Kingdom("Королевство 2.");
        kingdom02.setKing(king02);


        Kingdom kingdom03 = new Kingdom("Королевство 3.");
        Kingdom kingdom04 = new Kingdom("Королевство 4.");

        kingdom01.saveKingdomToFile(); // Сохраняем королевство 1.
        kingdom03.loadKingdomFromFile(); // Загружаем королевство 1 в королевство 3 из файла

        kingdom02.saveKingdomToFile(); // Сохраняем королевство 2.
        kingdom04.loadKingdomFromFile(); // Загружаем королевство 2 в королевство 4 из файла.

        System.out.println(kingdom03.getKingdomName()); // после загрузки у королевства 3 имя королевства 1.
        System.out.println(kingdom04.getKingdomName()); // после загрузки у королевства 4 имя королевства 2.

        // equals переопределен
        System.out.println(kingdom03.getKing().equals(kingdom01.getKing()));
        System.out.println(kingdom04.getKing().equals(kingdom02.getKing()));
        System.out.println(kingdom02.getKing().equals(kingdom01.getKing()));
        System.out.println(kingdom04.getKing().equals(kingdom03.getKing()));


    }
}
