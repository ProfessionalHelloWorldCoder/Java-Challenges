package Arrays;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        int i = 0;

        while(i < size) {
            System.out.print("Enter the element no " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
            i++;
        }
        return numbers;
    }

}
