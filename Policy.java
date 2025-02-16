
// name the class
public class Policy
{


/*
RULES:
include the following attributes:
- policy number
- provider name
- policy's first name
- policy's last name
- policyholder's last name
- policyholder's age
- policyholder's smoking status (will be "smoker" or "non-smoker")
- policyholder's height (in inches)
- policyholder's weight (in pounds)

- include a no-arg constructor (set default values for all fields)
- include a constructor that accepts arguments (it must accept all necessary arguments to fully initialize the Policy object)
- include appropriate setters and getters (ie, mutator and accessor methods) for each field
- include a method thaat calculatres and returns the BMI of the policyholder: BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2)
- include a method that calculates and returns the price of the insurance policy
   - the insurance policy has a base fee of 600 dollars
   - if the policyholder is over 50 years old, there is an additional 75 dollar fee
   - if the policyholder is a smoker, there is an additional fee of 100 dollars
   - if the policyholder has a BMI of over 35, there is an additional fee calculated as follows: additional fee = (BMI-35) * 20

*/


// attreibutes (fields)
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private String policyholderLastName;
   private int age;
   private String smokingStatus;
   private int height;  // in inches
   private int weight;  // in pounds
   
   
// no-arg constructor (will set default values for all fields)
public Policy() {
   policyNumber = "default";
   providerName = "default";
   firstName = "default";
   lastName = "default";
   policyholderLastName = "default";
   age = 0;
   smokingStatus = "non-smoker";
   height = 0;
   weight = 0;
}


// constructor that accepts arguments to initialize the object!
public Policy(String policyNumber, String providerName, String firstName, String lastName, 
              String policyholderLastName, int age, String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.policyholderLastName = policyholderLastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;      
}


// getters (aka accessor methods)
public String getPolicyNumber() {
   return policyNumber;
}

public String getProviderName() {
   return providerName;
}

public String getFirstName() {
   return firstName;
}

public String getLastName() {
   return lastName;
}

public String getPolicyholderLastName() {
   return policyholderLastName;
}

public int getAge() {
   return age;
}

public String getSmokingStatus() {
   return smokingStatus;
}

public int getHeight() {
   return height;
}

public int getWeight() {
   return weight;
}


// setters (aka mutator methods)
public void setPolicyNumber(String policyNumber) {
   this.policyNumber = policyNumber;
}

public void setProviderName(String providerName) {
   this.providerName = providerName;
}

public void setFirstName(String firstName) {
   this.firstName = firstName;
}

public void setLastName(String lastName) {
   this.lastName = lastName;
}

public void setPolicyholderLastName(String policyholderLastName) {
   this.policyholderLastName = policyholderLastName;
}

public void setAge(int age) {
   this.age = age;
}

public void setSmokingStatus(String smokingStatus) {
   this.smokingStatus = smokingStatus;
}

public void setHeight(int height) {
   this.height = height;
}

public void setWeight(int weight) {
   this.weight = weight;
}



// method to calculate AND return the BMI of the policyholder
public double calculateBMI() {
   return (weight * 703.0) / (height * height);
} 

// method to calculate and return the price of the insurance policy
public double calculatePrice() {
   double price = 600.0;
   
   // 75 dollar fee if policyholder is over 50 years old
   if (age > 50) {
      price += 75.0;
   }
   
   // 100 dollar fee if the policyholder is a smoker
   if (smokingStatus.equalsIgnoreCase("smoker")) {
      price += 100.0;
   }
   
   // fee if BMI is over 35
   double bmi = calculateBMI();
   if (bmi > 35) {
      double additionalFee = (bmi - 35) * 20.0;
      price += additionalFee;
   }
   
   return price;
}


}