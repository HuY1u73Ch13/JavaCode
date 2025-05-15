public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        //input number of sizeArray 
        int sizeArray = selectionSort.input();
                 
                
        //create array
        selectionSort.creatArray(sizeArray);

        
        //create random array
        
        selectionSort.createRandomArray();
        
        //display array
        selectionSort.display("Unsorted array: ");
        //selection sort 
        selectionSort.sort();
        
        //display sort array
        selectionSort.display("Sorte array: ");
                
        
    }
}
