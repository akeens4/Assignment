/**
 * OlderOrYounger
 */
    import java.util.Scanner;
public class OlderOrYounger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Input your age first User: ");
            int firstAge = input.nextInt();

            System.out.print("Input your age second User: ");
            int secondAge = input.nextInt();

                if(firstAge > secondAge) {
                    System.out.print("The first user with age " + firstAge + " is older than the second user with age " + secondAge + "!");
                } else {
                    System.out.print("The Second user with age " + secondAge + " is older than the first user with age " + firstAge + "!");

                }
        input.close();
    }
}