package main;

import model.GoodsBogie;
import util.SafetyChecker;

import java.util.Arrays;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // Create goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("G1", "Cylindrical", "Oil"),     // ✅ Valid
                new GoodsBogie("G2", "Rectangular", "Coal"),    // ✅ Valid
                new GoodsBogie("G3", "Cylindrical", "Coal"),    // ❌ Invalid
                new GoodsBogie("G4", "Rectangular", "Petrol")   // ❌ Invalid
        );

        System.out.println("🚆 Safety Compliance Check:\n");

        for (GoodsBogie bogie : goodsBogies) {

            if (SafetyChecker.isSafe(bogie)) {
                System.out.println("✅ SAFE: " + bogie);
            } else {
                System.out.println("❌ UNSAFE: " + bogie);
            }
        }
    }
}