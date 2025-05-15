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
        BubbleSort bubbleSort = new BubbleSort();
        // allow users to input number of array
        int sizeArray = bubbleSort.inputNumberOfArray();
        //create array
        bubbleSort.createArray(sizeArray);
        //generate random integer in number range input
        bubbleSort.generateRandomNumber();
        //Display unsorted array
        bubbleSort.displayArray("Unsorted Array: ");
        //sort by bubble sort
        bubbleSort.sortByBubbleSort();
        //display sorted array
        bubbleSort.displayArray("Sorted Array: ");
    }
}
