package ru.itmo.homeworks.hw20.units;

import ru.itmo.homeworks.hw20.base.BattleUnit;

public final class Knight extends BattleUnit{

    public Knight(int healthScope, int attackScore, int additionalHealth){
        super(healthScope, attackScore);
        if (additionalHealth < 1) throw new IllegalArgumentException("additionalHealth д.б. больше 1");
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Knight атакует!");
        enemy.minusHealth(this.attackScore);
        this.plusHealth(5);
        System.out.println("Knight восстанавливает часть здоровья после атаки. Теперь у него " +
                this.getHealthScore() + " здоровья");
    }
}