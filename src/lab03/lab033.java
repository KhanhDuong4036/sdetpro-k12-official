package lab03;


public class lab033 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        int temp;

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length ; j++) {
                if (intArr[i]>intArr[j]){
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        for (int value : intArr){
            System.out.print(value + " ");
        }

    }
}
