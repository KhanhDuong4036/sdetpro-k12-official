package lab03;

import java.util.Arrays;

public class Lab033_Fixed {
    public static void main(String[] args) {
        int[] myArr = {12, 34, 1, 16, 28};
        int myArrLength = myArr.length;

        for (int unsortedIndex = myArrLength - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int innerIndex = 0; innerIndex < unsortedIndex; innerIndex++) {
                if (myArr[innerIndex] > myArr[innerIndex + 1]) {
                    //SWAP
                    int temp = myArr[innerIndex];
                    myArr[innerIndex] = myArr[innerIndex + 1];
                    myArr[innerIndex + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArr));
    }
}
