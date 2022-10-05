package ru.itmo.homeworks.hw6.task1.climber;

public class Alpinist {
    private String name;
    private String address;

    public Alpinist(String name, String address) {
        setName(name);
        setAddress(address);
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.length() < 3) throw new IllegalArgumentException("В имени альпиниста должно быть минимум 3 буквы");
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    private void setAddress(String address) {
        if (address.length() < 5) throw new IllegalArgumentException("Адрес должен содержать минимум 5 символов");
        this.address = address;
    }
}
