package ru.itmo.homeworks.hw20.base;

import ru.itmo.homeworks.hw20.units.Infantry;
import ru.itmo.homeworks.hw20.units.Knight;

abstract public class BattleUnit extends Unit {
    protected int attackPoints;

    public BattleUnit(int healthPoint, int attackPoints) {
        super(healthPoint);
        if (attackPoints < 1) {
            throw new IllegalArgumentException("attackScore должен быть больше единицы");
        }
        this.attackPoints = attackPoints;
    }
    public int getAttackPoints() {return attackPoints;}

    abstract public void attack (BattleUnit enemy);

    //Фабричный метод
    public static BattleUnit getBattleUnit(){
        int randomIndex = (int) Math.round(Math.random());
        String[] types = {"knight", "infantry"};
        if ("knight".equals(types[randomIndex])) return new Knight(30, 10, 25);
        return new Infantry(30, 10, 5);
    }
    public static BattleUnit[] getBattleUnits(int count) {
        BattleUnit[] units = new BattleUnit[count];
        for (int i = 0; i < units.length; i++) {
            // в статических методах можно обратиться ТОЛЬКО к статическим свойствам или вызвать статические методы класса
            units[i] = getBattleUnit();
        }
        return units;
    }
}
