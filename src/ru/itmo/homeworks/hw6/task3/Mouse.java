package ru.itmo.homeworks.hw6.task3;

public class Mouse {
    private int speed;

    public Mouse(int speed){
        setSpeed(speed);
    }
    private void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("Скорость мыши не может быть меньше нуля!");
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
