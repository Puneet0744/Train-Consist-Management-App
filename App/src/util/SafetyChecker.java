package util;

import model.GoodsBogie;

public class SafetyChecker {

    public static void validateSafety(GoodsBogie bogie) {

        String shape = bogie.getShape();
        String cargo = bogie.getCargo();

        // Cylindrical → liquids only
        if (shape.equalsIgnoreCase("Cylindrical")) {
            if (!(cargo.equalsIgnoreCase("Oil") ||
                    cargo.equalsIgnoreCase("Petrol"))) {
                throw new RuntimeException("Unsafe cargo for Cylindrical bogie: " + bogie);
            }
        }

        // Rectangular → solids only
        else if (shape.equalsIgnoreCase("Rectangular")) {
            if (!(cargo.equalsIgnoreCase("Coal") ||
                    cargo.equalsIgnoreCase("Steel"))) {
                throw new RuntimeException("Unsafe cargo for Rectangular bogie: " + bogie);
            }
        }
    }
}