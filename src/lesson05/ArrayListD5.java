package lesson05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListD5 {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        /* Convert all number into even number
         * Loop all number
         *   if(isOddNumber)
         *      int newValue = myArrList.get(index) *2;
         *      set new value
         * */
        for (int index = 0; index < myArrList.size(); index++) {
            int targetNum = myArrList.get(index);
            boolean isOddNumber = targetNum % 2 != 0;
            if (isOddNumber) {
                myArrList.set(index, targetNum * 2);
            }
        }
        // Remove all number 2
        //Functional Interface | Predicate -> lambda expression (anonymous function)
       // myArrList.removeIf(value -> value == 2 || value == 4);
        myArrList.removeAll(List.of(2,4,6));


        for (int value : myArrList) {
            System.out.println(value);
        }
    }
}
