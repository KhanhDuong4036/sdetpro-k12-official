package lesson05;

import java.util.*;

public class ArrayListSublist {
    public static void main(String[] args) {
        List<Integer> oldArrList = new ArrayList<>(Arrays.asList(4,2,1,5,1,2,5,47,8,6,8,9,6,0));
        /*Get first 3 number
        * */

        Set<Integer> set = new HashSet<>(oldArrList);
        List<Integer> convertedList = new ArrayList<>(set);
        List<Integer> first3Value = convertedList.subList(0,3);
        System.out.println(first3Value);
    }
}
