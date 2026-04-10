package main;

import model.Bogie;

import java.util.*;
import java.util.stream.Collectors;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // Step 1: Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("B" + i, "Sleeper", 72));
        }

        // ================================
        // 🔴 LOOP APPROACH
        // ================================
        long startLoop = System.nanoTime();

        int totalSeatsLoop = 0;
        for (Bogie b : bogies) {
            totalSeatsLoop += b.getSeatCapacity();
        }

        long endLoop = System.nanoTime();
        long timeLoop = endLoop - startLoop;

        // ================================
        // 🟢 STREAM APPROACH
        // ================================
        long startStream = System.nanoTime();

        int totalSeatsStream = bogies.stream()
                .map(Bogie::getSeatCapacity)
                .reduce(0, Integer::sum);

        long endStream = System.nanoTime();
        long timeStream = endStream - startStream;

        // ================================
        // 📊 OUTPUT
        // ================================
        System.out.println("🚆 Performance Comparison:\n");

        System.out.println("Loop Total Seats: " + totalSeatsLoop);
        System.out.println("Loop Time (ns): " + timeLoop);

        System.out.println("\nStream Total Seats: " + totalSeatsStream);
        System.out.println("Stream Time (ns): " + timeStream);
    }
}