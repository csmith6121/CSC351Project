import java.util.Scanner;

public class Project_christa_smith {
   public static void main(String[] args) {
   // scanner object for user input
   Scanner scanner = new Scanner(System.in);
   
   // ask for and collect all information for the policy
   System.out.print("Enter policy number: ");
   String policyNumber = scanner.nextLine();
   
   System.out.print("Enter provider name: ");
   String providerName = scanner.nextLine();
   
   System.out.print("Enter first name: ");
   String firstName = scanner.nextLine();
   
   System.out.print("Enter last name: ");
   String lastName = scanner.nextLine();
   
   
   System.out.print("Enter policyholder's last name: ");
   String policyholderLastName = scanner.nextLine();
   
   System.out.print("Enter age: ");
   int age = scanner.nextInt();
   
   System.out.print("Enter policyholder's smoking status (smoker/non-smoker): ");
   scanner.nextLine();  // because leftover newline
   String smokingStatus = scanner.nextLine();
   
   System.out.print("Enter height (in inches): ");
   int height = scanner.nextInt();
   
   System.out.print("Enter weight (in pounds): ");
   int weight = scanner.nextInt();
   
   // create instance of the Policy class using the constructor argument!
   Policy policy = new Policy(policyNumber, providerName, firstName, lastName, 
                              policyholderLastName, age, smokingStatus, height, weight);
                              
   // display all information about policy using the getters
   System.out.println("\nPolicy Details:");
   System.out.println("Policy Number: " + policy.getPolicyNumber());
   System.out.println("Policyholder's First Name: " + policy.getFirstName());
   System.out.println("Policyholder's Last Name: " + policy.getLastName());
   System.out.println("Policyholder's Last Name (for policy): " + policy.getPolicyholderLastName());
   System.out.println("Policyholder's Age: " + policy.getAge());
   System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
   System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
   System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");


   // calc and display BMI
   double bmi = policy.calculateBMI();
   System.out.println("Policyholder's BMI: " + bmi);
   
   // calc and display price
   double price = policy.calculatePrice();
   System.out.println("Policy Price: $" + price);
   
   
   
   scanner.close();
   
   
   
   
   }



}