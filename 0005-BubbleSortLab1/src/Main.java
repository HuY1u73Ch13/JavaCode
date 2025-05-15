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
        //input number of size array
        int sizeArray = bubbleSort.inputNumberOfSize();
        //create array 
        bubbleSort.createArray(sizeArray);
        bubbleSort.createRandomArray();
        //display unsorted array
        bubbleSort.display("Unsorted array: ");
        //create random array
        bubbleSort.sort();
        //display sort array
        bubbleSort.display("Sorted array: ");
    }

}
