package Functions;

import java.util.Scanner;


//This is the utility class for user-input
public class ReadNumber {
    public static int readNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value : ");
        return input.nextInt();
    }
}
