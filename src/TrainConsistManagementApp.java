public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");


        String[] bogieIds = {};

import java.util.*;

public class TrainConsistManagementApp {


    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }


        Arrays.sort(bogieIds);


        String searchId = "BG309";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train consist.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;

            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");


            }
        }
    }


        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("=================================\n");

        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");

    }
}
