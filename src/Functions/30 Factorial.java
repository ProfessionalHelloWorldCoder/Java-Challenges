package Functions;

//Write a function that calculates the factorial of a given number.
class Factorial {
    public static void main(String[] args) {
        long number = ReadNumber.readNumber();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is : " + factorial);
    }

    private static long calculateFactorial(long number) {
        long fact = 1;

        if (number < 2) {
           return 1;
        }

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

}
