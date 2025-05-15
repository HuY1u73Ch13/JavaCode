import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    private int[] array;
    int input(String message){
        Scanner s = new Scanner(System.in);
        while(true){
            try {
                System.out.println(message);
                String input = s.nextLine().trim();
                if(input.isEmpty()){
                    System.out.println("Input can' be empty !!!");
                }else {
                    int number = Integer.parseInt(input);
                    if(number >= 0 && number <= Integer.MAX_VALUE){
                        return number;
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Invalid number !!!");
            }
        }
    }

    void createArray(int sizeArray) {
        array = new int[sizeArray];
    }

    void createRandomArray() {
        Random rd = new Random();
        for(int i=0;i<array.length;i++){
            int ramdomNumber = rd.nextInt(array.length);
            array[i]=ramdomNumber;
        }
    }

    void display(String message) {
        System.out.print(message);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            }else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }

    void sort() {
         int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
    public int[] getArray() {
        return array;
    }
}
