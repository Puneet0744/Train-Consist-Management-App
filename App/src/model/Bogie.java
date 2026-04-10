package model;

public class Bogie {
    private String id;
    private String type;
    private int seatCapacity; // NEW

    public Bogie(String id, String type, int seatCapacity) {
        this.id = id;
        this.type = type;
        this.seatCapacity = seatCapacity;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return id + "(" + seatCapacity + ")";
    }
}