package main;

import model.Bogie;
import util.SearchUtil;
import exception.EmptyTrainException;

import java.util.ArrayList;
import java.util.List;

public class UseCaseTrainConsistMgmt {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // ❌ Empty list case (for demo)

        String searchId = "B1";

        System.out.println("🔍 Searching for: " + searchId);

        try {
            Bogie result = SearchUtil.findById(bogies, searchId);

            if (result != null) {
                System.out.println("✅ Found: " + result);
            } else {
                System.out.println("❌ Bogie not found");
            }

        } catch (EmptyTrainException e) {
            System.out.println("❌ Exception: " + e.getMessage());
        }
    }
}