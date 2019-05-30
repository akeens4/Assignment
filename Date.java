/**
 * Date
 */
import java.util.Scanner;
public class Date {

    private int month,day,year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    // Method that displays the month, day and year with
    // a forward slash. 
    
    public String displayDate() {
        String date = month + "/" + day + "/" + year;
        return date;
    }

}

    class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month of the year: ");
        int month1 = input.nextInt();

        System.out.print("Enter the day of the year: ");
        int day1 = input.nextInt();
        
        System.out.print("Enter the year: ");
        int year1 = input.nextInt();

        Date  present = new Date(month1, day1, year1);

        System.out.printf("Today's date is: %s%n",present.displayDate());

        input.close();
    }
}
