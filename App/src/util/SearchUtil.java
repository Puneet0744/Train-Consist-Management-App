package util;

import model.Bogie;
import java.util.List;

public class SearchUtil {

    public static Bogie findById(List<Bogie> bogies, String id) {

        for (Bogie b : bogies) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }

        return null; // not found
    }
}