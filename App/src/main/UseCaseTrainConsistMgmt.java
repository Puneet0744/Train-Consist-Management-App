package main;

import model.Bogie;

import java.util.*;
import java.util.stream.Collectors;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // Create bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", "Sleeper"),
                new Bogie("B2", "AC Chair"),
                new Bogie("B3", "Sleeper"),
                new Bogie("B4", "Goods"),
                new Bogie("B5", "AC Chair"),
                new Bogie("B6", "Goods")
        );

        // UC9: Group by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Display result
        System.out.println("🚆 Grouped Bogies by Type:\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " → " + list);
        });
    }
}