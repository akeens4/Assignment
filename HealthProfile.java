/**
 * HealthProfile
 */
import java.util.Scanner;
public class HealthProfile {

     //Create Attributes of the class HeartRate.
     private String first_name;
     private String last_name;
     //private ;
     private String month1;
     private int day1;
     private int year1;
     private int currentYear;
     private int yearOfBirth;
     private int currentYear1;
     private int yearOfBirth1;
     private int height;
     private int weight;
     private String gender;
     private double body_mass_index;
     private double bmiCalc;
     private String value;
  

     ///Constructor of the Heart rate that includes local variable that is
     //a parameter for the set method and it is assigned to the instance Variable.
     public HealthProfile(String firstname1, String lastname1, String month1, int year1, int day1, int height,int weight){
         this.first_name = firstname1;
         this.last_name = lastname1;
         this.day1 = day1;
         this.month1 = month1;
         this.year1 = year1;
         this.height = height;
         this.weight = weight;
     }
     
     //Set method for the first name assigned to the instance variable first_name 
     public void setFirstName(String firstname) {
         this.first_name = firstname;
     }
 
     //Get method for the first name that returns first_name
     public String getFirstName(){
         return first_name;
     }
 
     //Set method for the last name assigned to the instance variable last_name 
     public void setLastName(String lastname) {
         this.first_name = lastname;
     }
 
     //Get method for the last name that returns last_name
     public String getLastName(){
         return last_name;
     }
     public void setHeight(int height) {
         this.height = height;
     }
     public int getHeight() {
         return height;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public int getWeight() {
         return weight;
     }
 
     //Set method for the date of birth which has local variables of month, day and year assigned to the instance variable date of birth 
     public void setDOB(String month, int day, int year) {
         this.month1 = month;
         this.day1 = day;
         this.year1 = year;
     }
 
     //Get method for the date of birth that returns date of birth
     public String getDOB(){
         return month1 + "-" + day1 + "-" + year1;
     }
 
     public void setAge(int currentYear,int yearOfBirth) {
         // currentYear - yearOfBirth;
         this.currentYear = currentYear;
         this.yearOfBirth = yearOfBirth;
     }
     public int age() {
         return currentYear - yearOfBirth;
     }
 
     public void setHeartRate(int currentYear, int yearOfBirth) {
         this.currentYear = currentYear;
         this.yearOfBirth = yearOfBirth;
     }
     public int getHeartRate() {
         return 220 - (currentYear - yearOfBirth);
     }
 
     public void setTargetRate(int currentYear1, int yearOfBirth1) {
         this.currentYear1 = currentYear1;
         this.yearOfBirth1 = yearOfBirth1;
     }
     public int getTargetRate(double value) {
         return (int)(getHeartRate() * value);
         }
 
     public void setBMI(int height, int weight, double bmiCalc) {
         this.height = height;
         this.weight = weight;
         this.bmiCalc = bmiCalc;
     }
    
     public double getBMI() {




        return bmiCalc = weight / (height * height);

        // if(bmiCalc < 18.5) {
        //     return "less  than 18.5";
        // } else if(bmiCalc > 18.5 && bmiCalc < 25.0) {
        //     return "between 18.5 and 24.9";
        // } 
        
    //     if(bmiCalc < 18.5) {
    //         System.out.printf("You are Underweight. Your BMI value is %.2f", bmiCalc);
    //     } else if(bmiCalc > 18.5 && bmiCalc < 24.9) {
    //         System.out.printf("You are Normal. Your BMI value is %.2f", bmiCalc);
    //     } else if(bmiCalc > 25 && bmiCalc < 29.9) {
    //         System.out.printf("You are Overweight. Your BMI value is %.2f", bmiCalc);
    //     } else {
    //         System.out.printf("You are Obese. Your BMI value is %.2f", bmiCalc);

    //     }
    }
        
    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        if(getBMI() < 18.5) {
            return " Underweight: less than 18.5";
        } else if(getBMI() > 18.5 && getBMI() < 25.0) {
            return " Normal: between 18.5 and 24.9";
        } else if(getBMI() >= 25.0 && getBMI() < 30.0) {
            return " Overweight: between 25 and 29.9";
        } else{
            return " Obese: 30 or greater";
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        System.out.print("Input First Name: ");
        String firstname = input.nextLine();

        System.out.print("Input Last Name: ");
        String lastname = input.nextLine();

        System.out.print("Input Month of Birth: ");
        String month = input.nextLine();

        System.out.print("Input Day of Birth: ");
        int day = input.nextInt();

        System.out.print("Input Year of Birth: ");
        int year = input.nextInt();

        System.out.print("Input the weight(in Kilogram): ");
        int weight = input.nextInt();

        System.out.print("Input the height(in Meters): ");
        int height = input.nextInt();



        HealthProfile omoloso = new HealthProfile(firstname,lastname,month,year,day,height, weight);
        omoloso.setHeartRate(2019, year);

        System.out.printf("%nPatient name: %s %s%nDate of birth: %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.printf("Patient %s %s is %dyears old%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.age());
        System.out.printf("Patient %s %s date of birth is %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.format("%n%n%s %s Patient Maximum heart rate is %d%nThe Target-heart-rate is %d",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getHeartRate(),omoloso.getTargetRate(0.6));
        System.out.format("%nThe BMI value is: %s", omoloso.getValue());
        input.close();



    }

}