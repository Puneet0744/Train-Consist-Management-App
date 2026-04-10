package util;

import model.GoodsBogie;

public class SafetyChecker {

    public static boolean isSafe(GoodsBogie bogie) {

        String shape = bogie.getShape();
        String cargo = bogie.getCargo();

        // Rule 1: Cylindrical → Only liquids
        if (shape.equalsIgnoreCase("Cylindrical")) {
            return cargo.equalsIgnoreCase("Oil") ||
                    cargo.equalsIgnoreCase("Petrol");
        }

        // Rule 2: Rectangular → Solid goods
        if (shape.equalsIgnoreCase("Rectangular")) {
            return cargo.equalsIgnoreCase("Coal") ||
                    cargo.equalsIgnoreCase("Steel");
        }

        return false;
    }
}