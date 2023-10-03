package lession03;

public class FlowControlKeyword {
    public static void main(String[] args) {
        /*
         * CHo 1 mang so nguyen
         * In ra phan tu la so chan dau tien cua mang
         * Neu mang ko co so chan, hay in ra: Mang ko co so chan
         */
        int[] arr = {1, 3, 5, 5, 5, 7, 5};
        boolean hasNoEvenNumber = false;
        for (int value : arr) {
            if (value % 2 == 0) {
                hasNoEvenNumber = true;
                System.out.println(value);
                break;
            }
        }
        if(!hasNoEvenNumber){
            System.out.println("Mang ko co so chan");
        }

    }
}
