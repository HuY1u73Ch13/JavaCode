
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class BubbleSort {

    private int[] array;

    int inputNumberOfSize() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter number of array: ");
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty !!!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number >= 0 && number <= Integer.MAX_VALUE) {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Number !!!");
            }
        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void display(String message) {
        System.out.print(message);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }

    void createRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = rd.nextInt(array.length);
            array[i] = randomNumber;
        }
    }

    void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
