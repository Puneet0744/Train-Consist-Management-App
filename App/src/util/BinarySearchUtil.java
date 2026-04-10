package util;

import model.Bogie;
import java.util.List;

public class BinarySearchUtil {

    public static Bogie binarySearch(List<Bogie> bogies, String targetId) {

        int left = 0;
        int right = bogies.size() - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            Bogie midBogie = bogies.get(mid);

            int compare = midBogie.getId().compareToIgnoreCase(targetId);

            if (compare == 0) {
                return midBogie; // found
            }
            else if (compare < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return null; // not found
    }
}