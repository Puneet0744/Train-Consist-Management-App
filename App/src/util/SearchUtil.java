package util;

import model.Bogie;
import exception.EmptyTrainException;

import java.util.List;

public class SearchUtil {

    public static Bogie findById(List<Bogie> bogies, String id)
            throws EmptyTrainException {

        if (bogies == null || bogies.isEmpty()) {
            throw new EmptyTrainException("Train has no bogies to search!");
        }

        for (Bogie b : bogies) {
            if (b.getId().equalsIgnoreCase(id)) {
                return b;
            }
        }

        return null;
    }
}