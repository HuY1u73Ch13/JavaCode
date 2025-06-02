/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import operation.Function;
import operation.Validation;
import object.Person;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        System.out.println("======= Shopping program ==========");
        System.out.print("input number of bill: ");
        int number = Validation.getInt(1, Integer.MAX_VALUE);
        
        int[] numberOfBill = Validation.inputBill(number);
        
        int total = function.calTotal(numberOfBill);
        System.out.print("Input value of wallet: ");
        int amout = Validation.getInt(1, Integer.MAX_VALUE);
        Person person = new Person(amout);
        person.printResultCompare(total);
    }
}
