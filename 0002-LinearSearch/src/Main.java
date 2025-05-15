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
        //allow user to input number of array
        int sizeArray = linearSearch.inputNumberOfArray();
        int valueToFind = linearSearch.inputSearchValue();
        //create array
        linearSearch.createArray(sizeArray);
        //generate random integer
        linearSearch.generateRandomNumber();
        //Display unsorted array
        linearSearch.displayArray("The array: ");
        //linearsearch
        int foundIndex = linearSearch.findLinearSearch(valueToFind);
        if (foundIndex != -1) {
            linearSearch.display("Found " + valueToFind + " at index " + foundIndex);
        } else {
            linearSearch.display(valueToFind + " not found in the array.");
        }
    }
}
