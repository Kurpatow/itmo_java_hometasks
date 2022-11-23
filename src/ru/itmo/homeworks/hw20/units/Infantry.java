package ru.itmo.homeworks.hw20.units;

import ru.itmo.homeworks.hw20.base.BattleUnit;

public final class Infantry extends BattleUnit {

    private int additionalAttack;

    public Infantry(int healthScope, int attackScore, int additionalAttack){
        super(healthScope, attackScore);
        if (additionalAttack < 1) throw new IllegalArgumentException("additionalAttack должна быть больше единицы");
        this.additionalAttack = additionalAttack;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Infantry атакует");
        enemy.minusHealth(this.attackScore + this.additionalAttack);
    }
}
