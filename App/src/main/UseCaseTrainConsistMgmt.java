package main;

import model.Bogie;
import util.BinarySearchUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("B3", "Sleeper", 72));
            bogies.add(new Bogie("B1", "AC Chair", 60));
            bogies.add(new Bogie("B4", "Sleeper", 80));
            bogies.add(new Bogie("B2", "AC Chair", 50));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Step 1: SORT list (VERY IMPORTANT)
        bogies.sort(Comparator.comparing(Bogie::getId));

        System.out.println("🚆 Sorted Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 2: Binary Search
        String searchId = "B3";

        System.out.println("\n🔍 Searching for: " + searchId);

        Bogie result = BinarySearchUtil.binarySearch(bogies, searchId);

        if (result != null) {
            System.out.println("✅ Found: " + result);
        } else {
            System.out.println("❌ Not Found");
        }
    }
}