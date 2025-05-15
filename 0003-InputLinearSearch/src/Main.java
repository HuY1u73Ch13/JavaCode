/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        //input 
        int sizeArray = linearSearch.inputArray();
        int valueToFind = linearSearch.inputSearchValue();
        //creatarray
        linearSearch.createArray(sizeArray);
        //inputarray
        linearSearch.inputArrayValue();
        //display
        linearSearch.displayArray();
        int foundIndex = linearSearch.findvalue(valueToFind);
        if (foundIndex != -1) {
            linearSearch.display("Found " + valueToFind + " at index " + foundIndex);
        } else {
            linearSearch.display(valueToFind + " not found in the array.");
        }
    }
}
