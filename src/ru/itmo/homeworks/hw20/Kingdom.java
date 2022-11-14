package ru.itmo.homeworks.hw20;

import ru.itmo.homeworks.hw20.units.King;

import java.io.Serializable;

public class Kingdom implements Serializable {

    transient private BinHandler<Kingdom> kingdomHandler;

    private String kingdomName;

    private King king;

    public Kingdom(String kingdomName) {
        setKingdomName(kingdomName);
        setKingdomHandler();
    }

    private void setKingdomHandler() {
        kingdomHandler = new BinHandler<>();
    }

    private void setKingdomName(String kingdomName) {
        if (kingdomName == null || kingdomName.length() < 3) {
            throw new IllegalArgumentException("В имени королевства д.б. более 3 символов");
        }
        this.kingdomName = kingdomName;
    }

    public String getKingdomName() {
        return kingdomName;
    }

    public void setKing(King king) {
        if (king == null) throw new IllegalArgumentException("Король не д.б. null");
        this.king = king;
    }

    public King getKing() {
        return king;
    }

    public void saveKingdomToFile() {
        kingdomHandler.writeToFile(this);
        System.out.println("Королевство " + kingdomName + " загружено в файл");
    }

    public void loadKingdomFromFile() {
        Kingdom loadKingdom = kingdomHandler.readFromFile();
        System.out.println("Королевство " + loadKingdom.getKingdomName() + " загружено из файла");
        setKing(loadKingdom.getKing());
        setKingdomName(loadKingdom.getKingdomName());
    }
}
