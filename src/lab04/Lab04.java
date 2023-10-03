package lab04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab04 {
    /*
     * Step 1: Add Random number in a List
     * Step 2: Print Menu
     * Step 3: Switch
     *           Case 1: Print all numbers
     *           Case 2: Max number
     *           Case 3: Min number
     *           Case 4: Search number
     *               if number in the list -> print number
     *               else print number is not in the list
     *           Case 0: Exit!
     *           Default: Input option again.
     * */
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        boolean isContinuing = true;
        int numRandomNumbers = 50;
        for (int index = 0; index < numRandomNumbers; index++) {
            int randomNum = new SecureRandom().nextInt(50);
            randomNumbers.add(randomNum);
        }

        while (isContinuing) {
            printMenu();
            int userOption = getUserOption();
            switch (userOption) {
                case 1:
                    printAllNumbers(randomNumbers);
                    break;
                case 2:
                    printMaxNumber(randomNumbers);
                    break;
                case 3:
                    printMinNumber(randomNumbers);
                    break;
                case 4:
                    searchNumber(randomNumbers);
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }

        }

    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("0. Exit!");

    }

    public static int getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printAllNumbers(List<Integer> myList) {
        System.out.println(myList);
    }

    public static void printMaxNumber(List<Integer> myList) {
        int maxValue = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) > maxValue) {
                maxValue = myList.get(index);
            }
        }
        System.out.println("The maximum number is: " + maxValue);
    }

    public static void printMinNumber(List<Integer> myList) {
        int minValue = myList.get(0);
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) < minValue) {
                minValue = myList.get(index);
            }
        }
        System.out.println("The minimum number is: " + minValue);
    }

    public static void searchNumber(List<Integer> myList) {
        System.out.print("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (myList.contains(number)) {
            System.out.println("Your number is: " + number);
            System.out.println("Your index number is: " + myList.indexOf(number));
        } else {
            System.out.println("Your number is not in the list");
        }
    }

}
