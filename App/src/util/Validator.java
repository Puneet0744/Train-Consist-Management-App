package util;

public class Validator {

    // ✅ Train ID: TRN-1234
    public static boolean isValidTrainId(String trainId) {
        return trainId.matches("^TRN-\\d{4}$");
    }

    // ✅ Cargo Code: CG-123 or CG-999
    public static boolean isValidCargoCode(String cargoCode) {
        return cargoCode.matches("^CG-\\d{3}$");
    }
}