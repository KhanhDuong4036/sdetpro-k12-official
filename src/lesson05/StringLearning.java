package lesson05;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
//        String withNumberString = "khanhduong4036hanhle";
//        char[] charArr = withNumberString.toCharArray();
//        for (char character : charArr) {
//            if (Character.isDigit(character)){
//                System.out.println(character + " is a digit");
//            }
//            if (Character.isLetter(character)){
//                System.out.println(character + " is a letter");
//            }
//        }
        //Immutable
//        String badWord = "         bad, very bad";
//        String filterBad = badWord.replace("bad", "b**");
//        System.out.println(badWord);
//        System.out.println(filterBad.trim());

        //Substring, indexOf, split
        String url = "https://google.com";
        System.out.println(url.substring(0,5));

        System.out.println(Arrays.toString(url.split("")));
        System.out.println(Arrays.toString(url.split("o")));

        System.out.println("My name is " .concat("Khanh") .concat("!"));


    }
}
