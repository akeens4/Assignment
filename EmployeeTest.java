/**
 * EmployeeTest
 */import java.util.Scanner;
public class EmployeeTest {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("First Name: ");
        String first = enter.nextLine();

        System.out.print("Last Name: ");
        String second = enter.nextLine(); 
        
        System.out.print("Salary: ");
        double salary = enter.nextDouble();

        Employee ademola = new Employee(first,second, salary);
        Employee solagbade = new Employee(first,second,salary);

        Employee ademolanewSalary = new Employee("Ademola","Adeshina",(200_000 + (0.1 * 200_000)));
        Employee solagbadenewSalary = new Employee("Gbadebo","Solagbade", (167_000  + (0.1 * 167_000)));

        System.out.printf("My name is %s %s. I am a working at Semicolon. I earn %f",ademola.getSalary());
        System.out.printf("My name is %s %s. I am a working at Semicolon. I earn %f",solagbade.getSalary());
        System.out.printf("My name is %s %s. I am a working at Semicolon. My salary has increased by 10% %f",ademolanewSalary.getSalary());
        System.out.printf("My name is %s %s. I am a working at Semicolon. My salary has increased by 10% %f",ademolanewSalary.getSalary());






        
    }
}