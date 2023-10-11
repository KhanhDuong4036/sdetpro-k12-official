package lesson05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cap Cuu");
        emergencyList.put(115, "Cuu Hoa");
        emergencyList.put(116, "Others");
        Set<Integer> allKeys = emergencyList.keySet();
        for (int key : allKeys) {
            String value = emergencyList.get(key);
            if (value.equals("Others")) {
                emergencyList.replace(key, "Something else");
            }
        }
        /*Remove the entry that has value "Something else"
         * */
        for (int key : allKeys) {
            String value = emergencyList.get(key);
            if (value.equals("Something else")) {
                emergencyList.remove(key);
            }
        }
        for (int key : allKeys) {
            String value = emergencyList.get(key);
            System.out.println(value);
        }
    }
}
