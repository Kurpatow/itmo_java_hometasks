package ru.itmo.homeworks.hw06.task1.climber;

public class Group {
    private Mountain mountain;
    private Alpinist[] alpinists;
    private boolean isOpen = true;
    private int maxAlpinists = 3;
    private int numberOfAlpinists = 0;

    public Group(Mountain mountain) {
        this.mountain = mountain;
        alpinists = new Alpinist[maxAlpinists];
    }
    public Mountain getMountain() {
        return mountain;
    }
    public Alpinist[] getAlpinists() {
        return alpinists;
    }
    public boolean isOpen() {
        if(isOpen)
            System.out.println("Набор в группу открыт \n");
        else
            System.out.println("Набор в группу закрыт \n");
        return isOpen;
    }
    public void addAlpinist(Alpinist alpinist) {
        if (isOpen) {
            alpinists[numberOfAlpinists] = alpinist;
            System.out.println("Альпинист " + alpinist.getName() + " добавлен в группу");
            numberOfAlpinists++;
        } else {
            System.out.println("Альпинист " + alpinist.getName() + " НЕ добавлен в группу!!! \nНабор в группу закрыт \n");
        }
        if (numberOfAlpinists == maxAlpinists) isOpen = false;
    }
}
