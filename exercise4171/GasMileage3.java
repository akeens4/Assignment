package chapter4.exercise4171;

/**
 * GasMileage1
 */
import java.util.Scanner;
public class GasMileage3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalMile = 0;
        int totalGallon = 0;
        int count = 0;
        int mile = 0;
        int gallon = 0;
        double milePerGallon = 0;
        double totalMilePertotalGallonForAllTrip = 0;
        int tripCount = 0;

        System.out.print("Enter the number of the trip, 0 to exit: ");
        tripCount = input.nextInt();

        while (count < tripCount) {
            System.out.print("Enter the mile covered: ");
            mile = input.nextInt();

            System.out.print("Enter the gallon of fuel used: ");
            gallon = input.nextInt();

            if(mile == -1) {
            	System.out.print("operation terminate!!!");
            	break;
            }

            milePerGallon = (double)(mile / gallon);
            System.out.printf("The mile per gallon for the %d trip is: %.2f%n",tripCount,milePerGallon);

            totalMile = totalMile + mile;
            
            totalGallon = totalGallon + gallon;

            count++;

            System.out.print("Enter the number of the trip, 0 to exit: ");
            tripCount = input.nextInt();

         

        }

        if(tripCount != 0){
        totalMilePertotalGallonForAllTrip = (double)totalMile / totalGallon;
        System.out.printf("The  mile per  gallon for all trip is: %.2f%n",totalMilePertotalGallonForAllTrip);
        input.close();
    }
       
    }
}