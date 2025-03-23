/*
- the policy class represents an insurance policy for a placeholder
- it includes attributes like the policy #, provider name, personal details
- and methods to calc bmi and insurance price
*/


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


// attributes (fields)
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


/* 
- constructor that accepts arguments to initialize the object!
- @param policyNumber the unique indentifier for the policy
- @param providerName the name of the insurance provider
- @param firstName the first name of the policyholder
- @param lastName the last name of the policyholder
- @param policyholderLastName the last name of the policyholder for this policy
- @param age the age of the policyholder
- @param smokingStatus the smoking status of the policyholder ("smoker" or "non-smoker")
- @param height The height of the policyholder in inches
- @param weight the weight of the policyholder in pounds
*/
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

/*
- gets the policy number
- @return the policy number
*/
public String getPolicyNumber() {
   return policyNumber;
}

/*
- gets the provider name
- @return the provider name
*/
public String getProviderName() {
   return providerName;
}

/*
- gets the first name of the policyholder
- @return the first name
*/
public String getFirstName() {
   return firstName;
}

/*
- gets the last name of the policyholder
- @return the last name
*/
public String getLastName() {
   return lastName;
}

/*
- gets policyholder's last name
- @return the policyholder's last name
*/
public String getPolicyholderLastName() {
   return policyholderLastName;
}

/*
- gets the age of the policyholder
- @return the age
*/
public int getAge() {
   return age;
}

/*
- gets the smoking status of the policyholder ("smoker" or "non-smoker")
- @return the smoking status
*/
public String getSmokingStatus() {
   return smokingStatus;
}

/*
- gets the height of the policyholder in inches
- @return the height in inches
*/
public int getHeight() {
   return height;
}

/*
- gets the weight of the policyholder in pounds
- @return the weight in pounds
*/
public int getWeight() {
   return weight;
}


// setters (aka mutator methods)

/*
- sets the policy number
- @param policyNumber the unique identifier for the policy
*/
public void setPolicyNumber(String policyNumber) {
   this.policyNumber = policyNumber;
}

/*
- sets the provider's name
- @param providerName The name of the insurance provider
*/
public void setProviderName(String providerName) {
   this.providerName = providerName;
}

/*
- sets first name of the policyholder
- @param firstName the first name of the policyholder
*/
public void setFirstName(String firstName) {
   this.firstName = firstName;
}

/*
- sets last name of the policyholder
- @param lastName the first name of the policyholder
*/
public void setLastName(String lastName) {
   this.lastName = lastName;
}

/*
- sets the policyholder's last name
- @param policyholderLastName the policyholder's last name
*/
public void setPolicyholderLastName(String policyholderLastName) {
   this.policyholderLastName = policyholderLastName;
}

/*
- sets the age of the policyholder
- @param age the age of the policyholder
*/
public void setAge(int age) {
   this.age = age;
}

/*
- sets the smoking status of the policyholder
- @param smokingStatus the smoking status of the policyholder ("smoker" or "non-smoker")
*/
public void setSmokingStatus(String smokingStatus) {
   this.smokingStatus = smokingStatus;
}

/*
- sets the height of the policyholder in inches
- @param height the height of the policyholder in inches
*/
public void setHeight(int height) {
   this.height = height;
}

/*
- sets the weight of the policyholder in pounds
- @param weight the weight of the policyholder in pounds
*/
public void setWeight(int weight) {
   this.weight = weight;
}



// method to calculate AND return the BMI of the policyholder
/*
- calculate the bmi (body mass index) of the policyholder
- @return the calculated bmi of the policyholder
*/
public double calculateBMI() {
   return (weight * 703.0) / (height * height);
} 

// method to calculate and return the price of the insurance policy
/*
- calculates the price of the insurance policy based on various factors
- @return the calculated price of the insurance policy
*/
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