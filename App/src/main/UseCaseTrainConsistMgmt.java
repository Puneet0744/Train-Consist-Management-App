package main;

import model.Bogie;

import java.util.*;
import java.util.stream.Collectors;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // Step 1: Create bogies with seat capacity
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", "Sleeper", 72),
                new Bogie("B2", "AC Chair", 60),
                new Bogie("B3", "Sleeper", 72),
                new Bogie("B4", "Goods", 0),
                new Bogie("B5", "AC Chair", 60),
                new Bogie("B6", "Goods", 0)
        );

        // Step 2: UC9 (Grouping)
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("🚆 Grouped Bogies:");
        grouped.forEach((type, list) ->
                System.out.println(type + " → " + list)
        );

        // Step 3: UC10 (Reduce - Total Seats)
        int totalSeats = bogies.stream()
                .map(Bogie::getSeatCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\n🎯 Total Seats in Train: " + totalSeats);
    }
}