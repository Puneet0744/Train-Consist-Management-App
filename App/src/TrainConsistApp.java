import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("==================================");
        System.out.println("   Train Consist Management App   ");
        System.out.println("==================================");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initialization details
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist: " + trainConsist);

        // Ready message
        System.out.println("\nSystem ready for operations...");
    }
}