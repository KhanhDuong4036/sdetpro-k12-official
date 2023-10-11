package lesson05;

public class StringLearning2Regex {
    public static void main(String[] args) {
        //Regular Expression | Regex
        /*
        * [^0-9]: khong phai tu 0 den 9
        * [^a-z]: khong phai tu a-z
        * */
        String cookingTimeStr = "105 mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]","");
        int cookingTimeNumber = Integer.parseInt(cookingTimeNumStr);
        System.out.println(cookingTimeNumber);
    }
}
