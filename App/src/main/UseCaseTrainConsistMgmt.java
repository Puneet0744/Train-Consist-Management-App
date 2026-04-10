package main;

import model.Bogie;
import util.Validator;

import java.util.*;
import java.util.stream.Collectors;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        // UC11: Regex Validation

        String trainId = "TRN-1234";
        String cargoCode = "CG-456";

        System.out.println("🚆 Validation Results:\n");

        // Validate Train ID
        if (Validator.isValidTrainId(trainId)) {
            System.out.println("✅ Valid Train ID: " + trainId);
        } else {
            System.out.println("❌ Invalid Train ID: " + trainId);
        }

        // Validate Cargo Code
        if (Validator.isValidCargoCode(cargoCode)) {
            System.out.println("✅ Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("❌ Invalid Cargo Code: " + cargoCode);
        }

        // ❌ Test invalid cases (for demo)
        String invalidTrain = "TRAIN12";
        String invalidCargo = "123-CG";

        System.out.println("\n🔍 Testing Invalid Inputs:\n");

        System.out.println(invalidTrain + " → " +
                (Validator.isValidTrainId(invalidTrain) ? "Valid" : "Invalid"));

        System.out.println(invalidCargo + " → " +
                (Validator.isValidCargoCode(invalidCargo) ? "Valid" : "Invalid"));
    }
}