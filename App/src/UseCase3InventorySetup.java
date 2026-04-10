import java.util.HashMap;
import java.util.Map;

public class UseCase3InventorySetup {

    // Inner class for managing inventory
    static class RoomInventory {

        private Map<String, Integer> roomAvailability;

        // Constructor
        public RoomInventory() {
            roomAvailability = new HashMap<>();
            initializeInventory();
        }

        // Initialize default rooms
        private void initializeInventory() {
            roomAvailability.put("Single Room", 5);
            roomAvailability.put("Double Room", 3);
            roomAvailability.put("Suite Room", 2);
        }

        // Get available rooms
        public int getAvailableRooms(String roomType) {
            return roomAvailability.getOrDefault(roomType, 0);
        }

        // Book a room
        public boolean bookRoom(String roomType) {
            int available = getAvailableRooms(roomType);

            if (available > 0) {
                roomAvailability.put(roomType, available - 1);
                return true;
            } else {
                System.out.println("No rooms available for: " + roomType);
                return false;
            }
        }

        // Display inventory
        public void displayInventory() {
            System.out.println("Hotel Room Inventory Status:\n");

            for (Map.Entry<String, Integer> entry : roomAvailability.entrySet()) {
                System.out.println(entry.getKey() + " -> Available Rooms: " + entry.getValue());
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        // Initial display
        inventory.displayInventory();

        // Simulate booking
        System.out.println("\nBooking a Single Room...");
        inventory.bookRoom("Single Room");

        // Updated display
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}