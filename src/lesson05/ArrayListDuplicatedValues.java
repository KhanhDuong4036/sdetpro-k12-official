package lesson05;

import java.util.*;

public class ArrayListDuplicatedValues {
    public static void main(String[] args) {
        List<Integer> oldListDuplicated = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int index = 0; index < oldListDuplicated.size(); index++) {
            int targetNum = oldListDuplicated.get(index);
            boolean isOddNumber = targetNum % 2 != 0;
            if (isOddNumber) {
                oldListDuplicated.set(index, targetNum * 2);
            }
        }
//        for (int value : oldListDuplicated) {
//            System.out.println(value);
//        }
        //2,2,6,4,10
        //Remove duplicated
        /*
        * Loop all number in the old list
        *   if (value from old list is NOT in the new list)
        *       put value into the new list
        *
        * */
//        List<Integer> newListWithoutDuplicated = new ArrayList<>();
//        for (int value : oldListDuplicated) {
//            if(!newListWithoutDuplicated.contains(value)){
//                newListWithoutDuplicated.add(value);
//            }
//        }
//        for (int newValue : newListWithoutDuplicated) {
//            System.out.println(newValue);
//
//        }
        Set<Integer> set = new HashSet<>(oldListDuplicated);
        System.out.println(set);

    }
}
