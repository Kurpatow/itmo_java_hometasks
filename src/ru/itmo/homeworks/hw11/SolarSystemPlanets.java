package ru.itmo.homeworks.hw11;

public enum SolarSystemPlanets {
    MERCURY("Меркурий", 3.2 , 2439.7),
    VENUS("Венера", 4.8, 6051.8),
    SATURN("Сатурн", 5.6,58232);

    private String name;
    private double weight;
    private double radius;

    SolarSystemPlanets(String name, double weight, double radius){
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }
    public static SolarSystemPlanets[] getSolarSystemPlanets() {
        return new SolarSystemPlanets[] {MERCURY, VENUS, SATURN};
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return '\n' + "Название планеты - " + name
                + '\n' + " Масса планеты - " + weight
                + '\n' + " Радиус планеты - " + radius;
    }
}
