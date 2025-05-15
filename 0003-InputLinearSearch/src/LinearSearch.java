
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

    int[] array;

    int inputArray() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Number of Array: ");
                String input = s.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Input can't be empty.");
                } else {
                    int number = Integer.parseInt(input);
                    //check number in range
                    if (number >= 0 && number <= Integer.MAX_VALUE) {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.err.println("Must be number.");
            }
        }
    }

    void inputArrayValue() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter element [" + i + "]: ");
                    array[i] = Integer.parseInt(s.nextLine().trim());
                    break;
                } catch (Exception e) {
                    System.err.println("Invalid number");
                }
            }
        }
    }

    int inputSearchValue() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter search value: ");
                return Integer.parseInt(s.nextLine().trim());
            } catch (Exception e) {
                System.err.println("Must be number !!!");
            }
        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void displayArray() {
        System.out.print("The Array: " + "[");
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

    int findvalue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    void display(String message) {
        System.out.print(message);
    }

}
