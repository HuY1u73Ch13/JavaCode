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
        SelectionSort ss = new SelectionSort();

        //input number of array 
        int sizeofArray = ss.input("Enter number of array: ");
        //input search value 
        int value = ss.input("Enter search value: ");
        //create array
        ss.createArray(sizeofArray);
        //create randomarray
        ss.createRandomArray();
        //display unsort array 
        ss.display("Unsorted array: ");
        //sort
        ss.sort();
        //display sort array
        ss.display("Sorted array: ");
        //display final
        int index = BinarySearch.search(ss.getArray(), value);
        if (index == -1) {
            System.out.println("Can't find !!!");
        }else {
            System.out.println("Found " + value + " at index: " + index);
        }
    }
}
