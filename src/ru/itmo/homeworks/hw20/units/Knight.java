package ru.itmo.homeworks.hw20.units;

import ru.itmo.homeworks.hw20.base.BattleUnit;

public final class Knight extends BattleUnit {

    public Knight(int healthPoint, int attackPoints, int additionalHealth){
        super(healthPoint, attackPoints);
        if (additionalHealth < 1) throw new IllegalArgumentException("additionalHealth д.б. больше 1");
    }
    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Knight атакует!");
        enemy.minusHealth(this.attackPoints);
        this.plusHealth(5);
        System.out.println("Knight восстанавливает часть здоровья после атаки. Теперь у него " +
                this.getHealthPoint() + " здоровья");
    }
}