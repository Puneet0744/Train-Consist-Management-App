package util;

import model.Bogie;
import java.util.List;

public class BubbleSortUtil {

    public static void sortByCapacity(List<Bogie> bogies) {

        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (bogies.get(j).getSeatCapacity() > bogies.get(j + 1).getSeatCapacity()) {

                    // swap
                    Bogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                }
            }
        }
    }
}