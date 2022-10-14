package ru.itmo.homeworks.hw6.task1;

import ru.itmo.homeworks.hw6.task1.climber.Alpinist;
import ru.itmo.homeworks.hw6.task1.climber.Mountain;
import ru.itmo.homeworks.hw6.task1.climber.Group;

public class Main {
    public static void main(String[] args) {
        Mountain beluha = new Mountain("Белуха", "Россия", 4506);
        Mountain kazbek = new Mountain("Казбек", "Россия", 5003);
        Mountain cugshpitce = new Mountain("Цугшпитце", "Германия", 2962);

        Alpinist mihail = new Alpinist("Михаил", "Россия");
        Alpinist dmitry = new Alpinist("Дмитрий", "Россия");
        Alpinist robert = new Alpinist("Роберт", "Россия");
        Alpinist elena = new Alpinist("Elena", "Бразилия");
        Alpinist ekaterina = new Alpinist("Ekaterina", "Аргентина");
        Alpinist kristina = new Alpinist("Kristina", "Мексика");
        Alpinist max = new Alpinist("Max", "Великобритания");

        Group groupBeluha = new Group(beluha);
        Group groupKazbek = new Group(kazbek);
        Group groupCugshpitce = new Group(cugshpitce);

        System.out.println("Перва группа: ");
        groupBeluha.addAlpinist(elena);
        groupBeluha.addAlpinist(ekaterina);
        groupBeluha.addAlpinist(kristina);
        groupBeluha.addAlpinist(max);

        System.out.println("Вторая группа: ");
        groupKazbek.addAlpinist(mihail);
        groupKazbek.addAlpinist(dmitry);
        groupKazbek.addAlpinist(robert);
        groupKazbek.isOpen();

        System.out.println("Третья группа: ");
        groupCugshpitce.addAlpinist(elena);
        groupCugshpitce.addAlpinist(kristina);
        groupCugshpitce.isOpen();
    }
}
