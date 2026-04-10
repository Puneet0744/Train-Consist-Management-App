import java.util.HashSet;
import java.util.Set;

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Track Unique Bogie IDs ===\n");

        // Create HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        System.out.println("Adding bogie IDs...\n");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        // Display results
        System.out.println("Final Bogie IDs in Train:\n");

        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Explanation message
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically removed by HashSet.");
        System.out.println("All bogie IDs are unique.");
    }
}