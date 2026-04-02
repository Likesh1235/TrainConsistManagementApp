import java.util.ArrayList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=================================\n");

        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.print("Passenger Bogies : [");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.print(bogies.get(i));
            if (i < bogies.size() - 1) System.out.print(", ");
        }
        System.out.println("]\n");

        bogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.print("Passenger Bogies : [");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.print(bogies.get(i));
            if (i < bogies.size() - 1) System.out.print(", ");
        }
        System.out.println("]\n");

        boolean found = bogies.contains("Sleeper");

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + found + "\n");

        System.out.println("Final Train Passenger Consist:");
        System.out.print("[");
        for (int i = 0; i < bogies.size(); i++) {
            System.out.print(bogies.get(i));
            if (i < bogies.size() - 1) System.out.print(", ");
        }
        System.out.println("]\n");

        System.out.println("UC2 operations completed successfully...");
    }
}