package lab03;

import java.util.Arrays;

public class Lab034 {
    public static void main(String[] args) {
        int[] arr01 = {1, 12, 16, 28, 34};
        int arr01Length = arr01.length;
        int[] arr02 = {1, 13, 16, 27, 99};
        int arr02Length = arr02.length;
        int[] mergedArr = new int[arr01Length + arr02Length];
        int index1 = 0;
        int index2 = 0;
        int indexM = 0;

        while (index1 < arr01Length && index2 < arr02Length) {
            if (arr01[index1] < arr02[index2]) {
                mergedArr[indexM] = arr01[index1];
                index1++;
            } else {
                mergedArr[indexM] = arr02[index2];
                index2++;
            }
            indexM++;
        }
        while (index1 < arr01Length) {
            mergedArr[indexM] = arr01[index1];
            index1++;
        }
        while (index2 < arr02Length) {
            mergedArr[indexM] = arr02[index2];
            index2++;
        }
        System.out.println(Arrays.toString(mergedArr));
    }
}
