package task_4;

import java.util.Arrays;

public class UserArray {
    public static void main(String[] args) {
        int[] array = new int []{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        array = addElement(array, 6);
        System.out.println(Arrays.toString(array));
    }

    public static int [] addElement(int [] array, int value) {
        int[] resultArray = new int[array.length + 1];
        System.arraycopy(array, 0, resultArray, 0, array.length);
        resultArray[array.length] = value;
        return resultArray;
    }
}
