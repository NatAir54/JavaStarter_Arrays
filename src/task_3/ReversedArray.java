package task_3;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(myReverse(array)));

        System.out.println(Arrays.toString(subArray(array, 4, array.length)));

    }


    public static int[] myReverse(int [] array){
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static int [] subArray(int [] array, int index, int count) {
        int[] resultArray = new int[count];
        System.arraycopy(array, index, resultArray, 0, count - index);
        if(index > 0) {
            for (int i = count - index; i < count; i++) {
                resultArray[i] = 1;
            }
        }
        return resultArray;
    }
}
