package lab06;

import java.util.Arrays;

public class lab061 {
    public static void main(String[] args) {
        String statement = "2hrs and 5 minutes";
        String[] splitStatement = statement.split(" and ");
        String hrsSub = splitStatement[0].replaceAll("[^0-9]","");
        String minSub = splitStatement[1].replaceAll("[^0-9]", "");
        int hrsNum = Integer.parseInt(hrsSub) * 60;
        int minNum = Integer.parseInt(minSub);
        int total = hrsNum + minNum;
        System.out.println(total);
    }
}
