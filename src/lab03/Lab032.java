package lab03;

public class Lab032 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int min = intArr[0];
        int max = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            } else if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
