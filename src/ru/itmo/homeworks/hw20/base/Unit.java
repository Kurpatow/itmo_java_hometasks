package ru.itmo.homeworks.hw20.base;

import java.io.Serializable;

abstract public class Unit implements Serializable {
    // protected - доступ в дочерний класс и внутри пакета
    protected int healthPoint;
    private final int maxHealthScore;

    public Unit(int healthScore){
        if (healthScore < 1) throw new IllegalArgumentException("healthScore не может быть меньше единицы");
        this.healthPoint = healthScore;
        this.maxHealthScore = healthScore;
    }

    public boolean isAlive(){
        return healthPoint > 0;
    }

    public void plusHealth(int healthScore) {
        if (isAlive()) return;
        this.healthPoint = Math.min(this.healthPoint + healthPoint, maxHealthScore);
    }
    public void minusHealth(int healthPoint) {
        if (isAlive()) this.healthPoint -= healthPoint;
    }
    public int getHealthPoint(){
        return healthPoint;
    }
    public void rest() {
        plusHealth(1);
        System.out.println("Unit восстанавливает силы");
    }
}
