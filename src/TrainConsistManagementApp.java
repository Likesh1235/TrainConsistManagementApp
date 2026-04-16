public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");

        String[] bogieIds = {};

        String searchId = "BG309";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train consist.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " not found.");
        }
    }
}