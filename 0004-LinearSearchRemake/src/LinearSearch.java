
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

    int inputNumberOfArray() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Number of Array: ");
                String input = scanner.nextLine().trim();
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

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void generateRandomNumber() {
        Random random = new Random();
        //sinh ra phan tu ngau nhien
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

    int inputSearchValue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Search Number: ");
                String input = scanner.nextLine().trim();
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

    void displayIndexofSearchNumber(int searchValue) {
        //search
        List<Integer> list = searchByLinearSearch(searchValue);
        //display
        if (list.isEmpty()) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found " + searchValue +" at index " + list.toString());
        }

    }

    private List<Integer> searchByLinearSearch(int searchValue) {
        //tao ra 1 arraylist o day
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                list.add(i);
            }
        }
        return list;
    }

}
