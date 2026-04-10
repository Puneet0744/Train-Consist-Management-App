package main;

import model.Bogie;
import util.SearchUtil;

import java.util.ArrayList;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie("B1", "Sleeper", 72));
            bogies.add(new Bogie("B2", "AC Chair", 60));
            bogies.add(new Bogie("B3", "Sleeper", 80));
            bogies.add(new Bogie("B4", "AC Chair", 50));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String searchId = "B3";

        System.out.println("🔍 Searching for Bogie ID: " + searchId);

        Bogie result = SearchUtil.findById(bogies, searchId);

        if (result != null) {
            System.out.println("✅ Found: " + result);
        } else {
            System.out.println("❌ Bogie not found");
        }
    }
}