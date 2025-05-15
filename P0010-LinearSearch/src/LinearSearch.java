
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
public class LinearSearch {
    private int array[];

    static int search(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    int input(String message) {
        Scanner s = new Scanner(System.in);
        while(true){
            try {
                System.out.println(message);
                String input = s.nextLine().trim();
                if(input.isEmpty()){
                    System.out.println("Input can' be empty !!!");
                }else {
                    int number = Integer.parseInt(input);
                    if(number >= 0 && number <= Integer.MAX_VALUE){
                        return number;
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Invalid number !!!");
            }
        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void createRandomArray() {
        Random rd = new Random();
        for(int i=1;i<array.length;i++){
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
            }else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public int[] getArray() {
        return array;
    }

}
