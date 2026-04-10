package main;

import model.GoodsBogie;
import util.SafetyChecker;

import java.util.Arrays;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("G1", "Cylindrical", "Oil"),     // ✅ valid
                new GoodsBogie("G2", "Rectangular", "Coal"),    // ✅ valid
                new GoodsBogie("G3", "Cylindrical", "Coal"),    // ❌ invalid
                new GoodsBogie("G4", "Rectangular", "Petrol")   // ❌ invalid
        );

        System.out.println("🚆 Safe Cargo Assignment:\n");

        for (GoodsBogie bogie : bogies) {

            try {
                // risky operation
                SafetyChecker.validateSafety(bogie);

                System.out.println("✅ Assigned safely: " + bogie);

            } catch (RuntimeException e) {

                System.out.println("❌ Error: " + e.getMessage());

            } finally {

                // always runs
                System.out.println("🔄 Checked bogie: " + bogie.getId());
                System.out.println("----------------------");
            }
        }
    }
}