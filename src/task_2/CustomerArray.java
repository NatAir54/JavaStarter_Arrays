package task_2;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of array elements:");
        int n = input.nextInt();
        int[] array = new int [n];

        getArbitraryIntegerArray(array);

        System.out.println("Maximum element: " + getMaximumElement(array));

        System.out.println("Minimum element: " + getMinimumElement(array));

        System.out.println("Sum of array elements: " + getSumOfElements(array));

        System.out.println("Arithmetic mean of array elements: " + getArithmeticMean(array));

        getOddValues(array);

    }


    public static void getArbitraryIntegerArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 25);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int getMaximumElement(int [] array) {
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        return max;
    }

    public static int getMinimumElement(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getSumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getArithmeticMean(int[] array) {
        int avg = getSumOfElements(array) / array.length;
        return avg;
    }

    public static void getOddValues(int[] array) {
        System.out.print("Odd elements of the array: ");
        int count = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("null");
        }
    }

}
