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
        // allow users to input number of array
        int sizeArray = linearSearch.inputNumberOfArray();
        //create array
        linearSearch.createArray(sizeArray);
        //generate random integer in number range input
        linearSearch.generateRandomNumber();
        //enter Search value
        linearSearch.displayArray("Array: ");
        int searchValue = linearSearch.inputSearchValue();

        //display index of search number
        linearSearch.displayIndexofSearchNumber(searchValue);

    }
}
