package lab06;

public class lab063 {
    public static void main(String[] args) {
        String myStr = "khanhduong4036";
        String output = "";
        char[] myStrArr = myStr.toCharArray();
        for (char character : myStrArr) {
            if (Character.isDigit(character)){
                output += character;
            }
        }
        System.out.println(output);
    }
}
