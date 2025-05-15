/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;

public class SelectionSort {

    private int[] array;

    int input(String message) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            String input = s.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input can't be empty !!!");
            } else {
                int number = Integer.parseInt(input);
                if (number >= 0 && number <= Integer.MAX_VALUE) {
                    return number;
                } else {
                    System.out.println("Invalid Input !!!");
                }
            }
        }
    }

    void createArray(int sizeofArray) {
        array = new int[sizeofArray];
    }
    
    public int[] getArray() {
        return array;
    }

    void createRandomArray() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            int rdnumber = rd.nextInt(array.length);
            array[i] = rdnumber;
        }
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

    void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j]<array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }   
            }
        }
    }
}
