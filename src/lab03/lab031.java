package lab03;

public class lab031 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
