/**
 * 
 */
package chapter4.exercise420;
//import java.util.Scanner;
/**
 * @author user
 *
 */
public class NewEmployee {

	/**
	 * @param args
	 */
	private int employeeId;
	private int hours_worked;
	private int hourly_rate;
/**
	 * @param employeeId
	 * @param hours_worked
	 * @param hourly_rate
	 */
	public NewEmployee(int employeeId, int hours_worked, int hourly_rate) {
		this.employeeId = employeeId;
		this.hours_worked = hours_worked;
		this.hourly_rate = hourly_rate;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the hours_worked
	 */
	public int getHours_worked() {
		return hours_worked;
	}
	/**
	 * @param hours_worked the hours_worked to set
	 */
	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}
	/**
	 * @return the hourly_rate
	 */
	public int getHourly_rate() {
		return hourly_rate;
	}
	/**
	 * @param hourly_rate the hourly_rate to set
	 */
	public void setHourly_rate(int hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public int setSalary(){
		int extrahourrate = 0;
		//int mainrate = 0;
		int salary = 0;
		
		if(hours_worked == 40) {
			salary = hourly_rate * 40;
		}
		else if(hours_worked > 40) {
		int extrahour = hours_worked - 40;
			
			extrahourrate = (hourly_rate + (hourly_rate / 2)) * extrahour;
			salary = (40 * hourly_rate) + extrahourrate;
		}
		return salary;
		
	}
	public static void main(String[] args) {
		
		NewEmployee employee1 = new NewEmployee(1, 60, 500);
		NewEmployee employee2 = new NewEmployee(2, 80, 600);
		NewEmployee employee3 = new NewEmployee(3, 100, 900);
		
		System.out.printf("Employee %d has a gross salary of: %d%n",employee1.getEmployeeId(),employee1.setSalary());
		System.out.printf("Employee %d has a gross salary of: %d%n",employee2.getEmployeeId(),employee2.setSalary());
		System.out.printf("Employee %d has a gross salary of: %d%n",employee3.getEmployeeId(),employee3.setSalary());

	}
}
