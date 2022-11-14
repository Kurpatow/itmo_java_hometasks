package ru.itmo.homeworks.hw20.units;

import ru.itmo.homeworks.hw20.base.BattleUnit;

public final class Infantry extends BattleUnit {
     private int extraAttack;

      public Infantry(int healthScore, int attackScore, int extraAttack) {
           super(healthScore, attackScore);
           if (extraAttack < 1) throw new IllegalArgumentException("extra - должно быть больше единицы");
           this.extraAttack = extraAttack;
      }
      public void upExtraAttack() {
          extraAttack += Math.random() * 3;
      }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Infantry attack");
        enemy.minusHealth(this.attackScore + this.extraAttack);
    }
}
