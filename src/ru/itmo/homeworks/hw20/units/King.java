package ru.itmo.homeworks.hw20.units;

import ru.itmo.homeworks.hw20.base.AppSetting;
import ru.itmo.homeworks.hw20.base.BattleUnit;
import ru.itmo.homeworks.hw20.base.Unit;

public class King extends Unit {
    private int gold = AppSetting.GOLD;

    private BattleUnit[] army;

    public King(int healthScore){
        super(healthScore);
    }

    public int getGold(){
        return gold;
    }

    // создание армии
    public void createArmy(){
        if (gold < AppSetting.ARMY_PRICE) {
            System.out.println("Стоимость армии: " + AppSetting.ARMY_PRICE + ". У Короля доступно: " + gold);
            return;
        }
        gold -= AppSetting.ARMY_PRICE;
        army = BattleUnit.getBattleUnits(AppSetting.UNITS_COUNT);
    }

    public void updateArmy(){
        for (int i = 0; i < army.length; i++) {
            if (gold < AppSetting.UNIT_PRICE) {
                System.out.println("Стоимость юнита: " + AppSetting.UNIT_PRICE + ". У Короля доступно: " + gold);
                return;
            }
            if (!army[i].isAlive()) {
                gold -= AppSetting.UNIT_PRICE;
                army[i] = BattleUnit.getBattleUnit();
            }
        }
    }

    public void startBattle(King enemy){
        // TODO:: текущий король нападает на другого короля. Реализовать сражение армий
        int thisKingDeathUnitsCounter = 0, enemyDeathUnitsCounter = 0;
        int thisKingArmyNumberOfUnits = this.army.length;
        int enemyKingArmyNumberOfUnits = enemy.army.length;

        System.out.println("Начало сражения армий.");

        for (BattleUnit thisKingUnit: this.army) {
            for (BattleUnit enemyUnit: enemy.army) {
                while (thisKingUnit.isAlive() && enemyUnit.isAlive()) {
                    thisKingUnit.attack(enemyUnit);
                    if (!enemyUnit.isAlive()) {
                        System.out.println("Погиб юнит обороны.");
                        enemyDeathUnitsCounter++;
                        break;
                    }
                    enemyUnit.attack(thisKingUnit);
                    if (!thisKingUnit.isAlive()) {
                        System.out.println("Погиб юнит нападения.");
                        thisKingDeathUnitsCounter++;
                        break;
                    }
                }
                if (!thisKingUnit.isAlive()) break; // Если умер юнит нападения, в бой должен вступить следующий
            }
            if (thisKingArmyNumberOfUnits == thisKingDeathUnitsCounter) {
                System.out.println("Победила защита");
                break;
            }
            if (enemyKingArmyNumberOfUnits == enemyDeathUnitsCounter) {
                System.out.println("Победило нападение");
                break;
            }
        }
        System.out.println("Армия нападения = " + thisKingArmyNumberOfUnits + " погибло юнитов = " + thisKingDeathUnitsCounter);
        System.out.println("Армия защиты = " + enemyKingArmyNumberOfUnits + " погибло юнитов = " + enemyDeathUnitsCounter);
    }

    @Override
    public void rest(){
        if (gold < AppSetting.REST_PRICE) return;
        gold -= AppSetting.REST_PRICE;
        super.rest();
        System.out.println("King восстанавливает силу");
    }
    // final метод нельзя переопределить в дочернем классе
    public final void rest(Unit unit) {
        if (gold < AppSetting.REST_PRICE * 2) return;
        gold -= AppSetting.REST_PRICE * 2;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("King и Unit восстанавливают силу");
    }

    @Override
    public boolean equals(Object obj) {
        King anotherKing;

        if (obj instanceof King) anotherKing = (King) obj;
        else return false;

        return this.gold == anotherKing.getGold() &&
                this.army.length == anotherKing.army.length &&
                this.healthPoint == anotherKing.getHealthPoint();
    }
}
