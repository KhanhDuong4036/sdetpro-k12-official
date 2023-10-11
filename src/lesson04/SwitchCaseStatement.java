package lesson04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int userNumber = scanner.nextInt();

        switch (userNumber){
            case 1:
                System.out.println("Giai nhat");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Thank you!!!");

        }
    }
}
