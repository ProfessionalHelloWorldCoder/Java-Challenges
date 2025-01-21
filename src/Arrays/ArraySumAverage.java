package Arrays;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Challenge-40 : Array Sum Average ");
        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        double average = average(numArray);

        System.out.println("Sum of the numbers : " + sum);
        System.out.println("Average of the numbers : " + average);

    }

    public static long sum(int[] numArray) {
        long sum = 0;

        for (int j : numArray) {
            sum += j;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
