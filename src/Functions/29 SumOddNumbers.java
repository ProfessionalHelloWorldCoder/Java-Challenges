package Functions;

//Create a program to sum all odd numbers from 1 to a specified number N.

class SumOddNumbers {
    public static void main(String[] args) {
        int nthNumber = ReadNumber.readNumber();
        int oddSum = sumOddNumbers(nthNumber);
        System.out.println("Sum of all odd numbers from 1 to " + nthNumber + " is : " + oddSum);
    }


    public static int sumOddNumbers(int Nth) {
        int sum = 0;

        for (int i = 1; i <= Nth; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
