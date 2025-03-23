import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        final int MAX_POLICIES = 5;
        Policy[] policies = new Policy[MAX_POLICIES];
        int policyCount = 0;

        // Open the file
        File file = new File("PolicyInformation.txt");

        // Check if the file exists before trying to open it
        if (file.exists()) {
            Scanner scanner = null;

            // Try to create a Scanner to read the file
            try {
                scanner = new Scanner(file);

                // Read each policy data from the file
                while (scanner.hasNextLine() && policyCount < MAX_POLICIES) {
                    String policyNumber = scanner.nextLine().trim();
                    String providerName = scanner.nextLine().trim();
                    String firstName = scanner.nextLine().trim();
                    String lastName = scanner.nextLine().trim();
                    String policyholderLastName = scanner.nextLine().trim();
                    int age = Integer.parseInt(scanner.nextLine().trim());
                    String smokingStatus = scanner.nextLine().trim();
                    int height = Integer.parseInt(scanner.nextLine().trim());
                    int weight = Integer.parseInt(scanner.nextLine().trim());

                    policies[policyCount] = new Policy(policyNumber, providerName, firstName, lastName, 
                                                       policyholderLastName, age, smokingStatus, height, weight);
                    policyCount++;
                }

                // Close the scanner
                scanner.close();

                // Display each policy's details
                for (int i = 0; i < policyCount; i++) {
                    Policy policy = policies[i];
                    System.out.println("Policy Number: " + policy.getPolicyNumber());
                    System.out.println("Provider Name: " + policy.getProviderName());
                    System.out.println("Policyholder: " + policy.getFirstName() + " " + policy.getLastName());
                    System.out.println("Policyholder Last Name: " + policy.getPolicyholderLastName());
                    System.out.println("Age: " + policy.getAge());
                    System.out.println("Smoking Status: " + policy.getSmokingStatus());
                    System.out.println("Height: " + policy.getHeight() + " inches");
                    System.out.println("Weight: " + policy.getWeight() + " pounds");
                    System.out.println("BMI: " + policy.calculateBMI());
                    System.out.println("Insurance Price: $" + policy.calculatePrice());
                    System.out.println("--------------------------------------");
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error: The file was not found.");
            }
        } else {
            System.out.println("File not found!");
        }
    }
}
