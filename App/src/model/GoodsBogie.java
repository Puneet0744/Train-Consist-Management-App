package model;

public class GoodsBogie extends Bogie {

    private String shape;   // Rectangular / Cylindrical
    private String cargo;   // Coal / Oil / Steel etc.

    public GoodsBogie(String id, String shape, String cargo) {
        super(id, "Goods", 0);
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return getId() + "(" + shape + ", " + cargo + ")";
    }
}