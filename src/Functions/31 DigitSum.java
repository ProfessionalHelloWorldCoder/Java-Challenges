package Functions;

//Create a program that computes the sum of the digits of an integer.

class DigitSum {
    public static void main(String[] args) {
        int number = ReadNumber.readNumber();
        int digitSum = calculateDigitSum(number);
        System.out.println("Sum of Digits of " + number + " is : " + digitSum);
    }

    private static int calculateDigitSum(int number) {
        int sum = 0;
        int temp;

        while (number > 0) {
            temp = number % 10;
            sum += temp;
            number /= 10;
        }

        return sum;
    }
}
