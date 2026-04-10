package model;

import exception.InvalidCapacityException;

public class Bogie {
    private String id;
    private String type;
    private int seatCapacity;

    public Bogie(String id, String type, int seatCapacity) throws InvalidCapacityException {

        if (seatCapacity <= 0 && !type.equalsIgnoreCase("Goods")) {
            throw new InvalidCapacityException("Invalid seat capacity for bogie: " + id);
        }

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