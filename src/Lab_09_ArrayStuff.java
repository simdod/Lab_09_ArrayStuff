import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1: Declare array of 100 ints

        int[] dataPoints = new int[100];

        // Task 2: Fill array with random values between 1 and 100

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }


        // Task 3: Display all array values separated by " | "

        System.out.println("\nData Points:");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");

        // Task 4: Calculate sum and average

        int sum = 0;
        for (int val : dataPoints)
        {
            sum += val;
        }
        double avg = (double) sum / dataPoints.length;

        System.out.printf("The sum of dataPoints is %d.%n", sum);
        System.out.printf("The average of dataPoints is %.2f.%n%n", avg);


        // Task 5: Ask user for a value (1–100) using SafeInput

        int userValue = SafeInput.getRangedInt(in, "Enter a value to search for (1-100)", 1, 100);


        // Task 6: Count occurrences of user value in array

        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.printf("The value %d was found %d times in the array.%n%n", userValue, count);


        // Task 7: Find first position of another user value (break early)

        int searchVal = SafeInput.getRangedInt(in, "Enter another value to search for (1-100)", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchVal)
            {
                System.out.printf("The value %d was found first at index %d.%n%n", searchVal, i);
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.printf("The value %d was not found in the array.%n%n", searchVal);
        }


        // Task 8: Find minimum and maximum values

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.printf("The minimum value in dataPoints is %d.%n", min);
        System.out.printf("The maximum value in dataPoints is %d.%n%n", max);


        // Task 9: Call static getAverage() method

        System.out.printf("The calculated average using getAverage() is %.2f.%n", getAverage(dataPoints));

        System.out.println("\nProgram complete. Goodbye!");
    }


    // Task 9 Static Method: Calculate and return average

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
