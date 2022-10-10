package ru.itmo.homeworks.hw6.task3;

public class Cat {
    private String name;
    private int speed, weight;
    private Mouse[] mouses;

    private int mouseCount = 0;

    public Cat(String name, int speed, int weight) {
        setName(name);
        setSpeed(speed);
        setWeight(weight);
        initMouses();
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.length() < 3) throw new IllegalArgumentException("В имени не может быть меньше трёх букв");
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0) throw new IllegalArgumentException("Скорость не может быть отрицательной");
        this.speed = speed;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight < 0) throw new IllegalArgumentException("Вес не может быть отрицательным");
        this.weight = weight;
    }
    private void initMouses() {
        if (mouseCount == 0) {
            mouses = new Mouse[100];
        }
    }
    public void catchingMouse(Mouse mouse) {
        if (speed > mouse.getSpeed()) { //Скорость кота больше чему  мыши
            if (mouseCount < mouses.length) {
                System.out.println("Кот " + getName() + " съел мышь");
                mouses[mouseCount] = mouse;
                mouseCount++;
            } else {
                System.out.println("Наелся."); //Мышей не может быть больше 100
            }
        }
    }
    public Mouse[] getMouses() {
        return mouses;
    }
    public Mouse[] lostMouses() {
        Mouse[] lostMousesArray = mouses.clone();
        mouseCount = 0;
        initMouses();
        return lostMousesArray;
    }
    public void attackAnotherCat(Cat cat) {  //Аттакуем другого кота
        if(weight > cat.getWeight()) {
            System.out.println(getName() + " отобрал у " + cat.getName() + " всех мышей");
            Mouse[] anotherCatMouses = cat.lostMouses();
            for(Mouse mouse: anotherCatMouses) {
                if (mouse != null) catchingMouse(mouse);
            }
        } else if(cat.getWeight() > weight) {
            cat.attackAnotherCat(this);
        }
    }
    public void printMouses() {
        int mCount = 0;
        System.out.println("Мыши " + name + ":");
        for(Mouse mouse: mouses) {
            if (mouse != null) System.out.println("Мышь " + ++mCount);
        }
    }
}
