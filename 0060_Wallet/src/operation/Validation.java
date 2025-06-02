/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operation;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(int min, int max) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Input can't be empty.");
                } else {
                    int number = Integer.parseInt(input);
                    if (number >= min && number <= max) {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Must be number.");
            }
        }
    }

    public static int[] inputBill(int size) {
        int[] bill = new int[size];
        for (int i = 0; i<size ;i++){
            System.out.println("Input value of bill " + (i+1) + ": ");
            bill[i] = getInt(1, Integer.MAX_VALUE);
        }
        return bill;
    }
}
