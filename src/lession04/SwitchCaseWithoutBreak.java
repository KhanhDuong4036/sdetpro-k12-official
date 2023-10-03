package lession04;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int userNumber = scanner.nextInt();

        switch (userNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                System.out.println("Thank you!!!");

        }
    }
}
