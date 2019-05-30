//Heart Rate Calculation
//Name: Awoseemo Akinlolu.
//22 May 2019.
//Heart rate is 220 - age;
//  Target Heart rate = 50% to 80% of maximum heart rate
//AHA American Heart Association



/**
 * HeartRate
 */
    import java.util.Scanner;
 //Create a class  HeartRate

public class HeartRate {

    //Create Attributes of the class HeartRate.
    private String first_name;
    private String last_name;
    //private String date_of_birth;
    private String month1;
    private int day1;
    private int year1;
    private int currentYear;
    private int yearOfBirth;
    private int currentYear1;
    private int yearOfBirth1;




    ///Constructor of the Heart rate that includes local variable that is
    //a parameter for the set method and it is assigned to the instance Variable.
    public HeartRate(String firstname1, String lastname1, String month1, int year1, int day1){
        this.first_name = firstname1;
        this.last_name = lastname1;
        this.day1 = day1;
        this.month1 = month1;
        this.year1 = year1;
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



        HeartRate omoloso = new HeartRate(firstname,lastname,month,year,day);
        omoloso.setHeartRate(2019, year);

        System.out.printf("%nPatient name: %s %s%nDate of birth: %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.printf("Patient %s %s is %dyears old%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.age());
        System.out.printf("Patient %s %s date of birth is %s%n",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getDOB());
        System.out.format("%n%n%s %sPatient Maximum heart rate is %d%nThe Target-heart-rate is %d",omoloso.getFirstName(),omoloso.getLastName(),omoloso.getHeartRate(),omoloso.getTargetRate(0.6));

        input.close();

}

}