package main;

import java.util.Arrays;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {"B3", "B1", "B4", "B2"};

        System.out.println("🚆 Before Sorting:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        // Step 2: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\n🚆 After Sorting:");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}