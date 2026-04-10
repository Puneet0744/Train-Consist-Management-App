package main;

import model.Bogie;
import exception.InvalidCapacityException;

import java.util.ArrayList;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("B1", "Sleeper", 72));   // ✅ valid
            bogies.add(new Bogie("B2", "AC Chair", 60));  // ✅ valid
            bogies.add(new Bogie("B3", "Sleeper", -10));  // ❌ invalid
            bogies.add(new Bogie("B4", "Goods", 0));      // ✅ allowed (goods)
        }
        catch (InvalidCapacityException e) {
            System.out.println("❌ Exception Caught: " + e.getMessage());
        }

        System.out.println("\n🚆 Valid Bogies in System:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}