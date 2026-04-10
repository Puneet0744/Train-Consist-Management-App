package main;

import model.Bogie;
import util.BubbleSortUtil;

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

        System.out.println("🚆 Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Apply Bubble Sort
        BubbleSortUtil.sortByCapacity(bogies);

        System.out.println("\n🚆 After Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}