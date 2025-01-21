package Functions;

//Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");

        int table = readNumber();

        showTable(table);
    }

    public static void showTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        return input.nextInt();
    }
}
