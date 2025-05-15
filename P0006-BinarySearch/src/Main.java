public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        
        // input number of size 
        
        int sizeArray = selectionSort.input("Enter number of array: ");
          
        // input number search value 
        int value = selectionSort.input("Enter search value: ");
        // create array 
        selectionSort.createArray(sizeArray);
        // create random array
        selectionSort.createRandomArray();
        // display array 
        selectionSort.display("Unsorted array: ");
        // sort 
        selectionSort.sort();
        // display sorted array
        selectionSort.display("Sorted array: ");
        // binary search
        int index = BinarySearch.search(selectionSort.getArray(), value);
        // dislay ketqua 
        if (index == -1) {
            System.out.println("Value not found in array.");
        } else {
            System.out.println("Found " + value + " at index: " + index);
        }
    }
}
