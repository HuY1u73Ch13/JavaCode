
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class LinearSearch {

    private int[] array;

    int inputNumberOfArray() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter number of array: ");
                String input1 = scanner.nextLine().trim();
                if (input1.isEmpty()) {
                    System.err.println("Input can't be empty.");
                } else {
                    int number = Integer.parseInt(input1);
                    //check number in range
                    if (number >= 0 && number <= Integer.MAX_VALUE) {
                        return number;
                    } else {
                        System.err.println("Invalid Number !!!");
                    }
                }
            } catch (Exception e) {
                System.err.println("Must be a valid number.");
            }
        }
    }

    int inputSearchValue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter search value: ");
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.print("Must be a valid number.");
            }

        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void generateRandomNumber() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(array.length);
            array[i] = randomNumber;
        }
    }

    void displayArray(String message) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    int findLinearSearch(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

    void display(String message) {
        System.out.print(message);
        //System.out.println("");

    }

}
