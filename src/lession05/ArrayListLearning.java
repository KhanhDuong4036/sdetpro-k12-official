package lession05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //CRUD
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        //READ
//        for (Integer value : myList) {
//            System.out.println(value);
//        }
        for (int value = 0; value < myList.size(); value++) {
            System.out.println(myList.get(value));
        }
    }
}
