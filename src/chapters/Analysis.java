package chapters;

import java.util.Scanner;
public class Analysis {

	public static void main(String[] args) {
		
		

		/**
		 * Analysis
		 */

		 // Initialize passes to zero
		 //initialize failure to zero
		 //intialize countto one
		 //Input the 10 exam results, and count passes and failures
		 //While student counter is less than or equal to 10
		 // Prompt the user to enter the next exam result
		 //  Input the next exam result
		 //     If the student passed
		 //         Add  one to passes
		 //         Else
//		              Add one to failures
//		                  Add one to student counter

		 Scanner input = new Scanner(System.in);
		       
		        int passes = 0;
		        int failures = 0;
		        int count = 1;

		        while(count <= 10){
		        
		            System.out.print("Enter result 1 for pass, 2 for fail: ");
		            int result = input.nextInt();

		            if(result == 1) {
		                passes++;
		            } else if(result == 2){
		                failures++;
		            }
		            else {
		            	continue;
		            }
		            count++;
		        }


		        //Print out the number of passes and failures

		        System.out.printf("The number of passes is: %d, while the number of failures is: %d%n",passes,failures);
		        if(passes > 8) {
		            System.out.print("Bonus to  instructor");
		        }
		        input.close();

		    }

	}


