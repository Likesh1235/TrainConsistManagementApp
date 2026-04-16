import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==========================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIds);

        String searchId = "BG309";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchId);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }
    }
}