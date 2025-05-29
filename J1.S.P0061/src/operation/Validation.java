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
    
    public static double checkDoule(String message, double min, double max) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Input can't be empty.");
                } else {
                    double number = Double.parseDouble(input);
                    //check number in range
                    if (number >= min && number <= max) {
                        return number;
                    }else{
                        System.out.println("Please input in range [" + min + "->" + max + "]");
                    }
                    
                }
            } catch (NumberFormatException e) {
                System.err.println("Pls input number of Double.");
            }
        }
    }
}
