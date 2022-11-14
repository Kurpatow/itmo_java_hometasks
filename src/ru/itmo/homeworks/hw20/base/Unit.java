package ru.itmo.homeworks.hw20.base;

import java.io.Serializable;

abstract public class Unit implements Serializable {
    // protected - доступ в дочерний класс и внутри пакета
    protected int healthScore;
    private final int maxHealthScore;

    public Unit(int healthScore){
        if (healthScore < 1) throw new IllegalArgumentException("healthScore не может быть меньше единицы");
        this.healthScore = healthScore;
        this.maxHealthScore = healthScore;
    }

    public boolean isAlive(){
        return healthScore > 0;
    }

    public void plusHealth(int healthScore) {
        if (isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore);
    }

    public void minusHealth(int healthScore) {
        if (isAlive()) this.healthScore -= healthScore;
    }

    public int getHealthScore(){
        return healthScore;
    }

    public void rest() {
        plusHealth(1);
        System.out.println("Unit восстанавливает силы");
    }
}
