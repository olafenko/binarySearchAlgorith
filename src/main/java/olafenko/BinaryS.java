package olafenko;

import java.util.Arrays;
import java.util.Random;

public class BinaryS {


    private final int[] numbers = {1, 3,5, 8, 9, 10, 13, 14, 46, 67};

    public void run() {

        System.out.println(Arrays.toString(numbers));
//        System.out.println("Wanted value exists on index: " + binarySearch(numbers,1));

        binarySearch(numbers,0,numbers.length - 1, 4);


    }

//    private int binarySearch(int[] arr, int valueToSearch) {
//
//
//        int leftPointer = 0;
//        int rightPointer = numbers.length - 1;
//
//        while (leftPointer <= rightPointer) {
//
//            int middle = (leftPointer + rightPointer) / 2;
//
//            int middleNumber = arr[middle];
//
//            if (middleNumber == valueToSearch) {
//
//                return middle;
//            } else if (middleNumber < valueToSearch) {
//                leftPointer = middle + 1;
//            } else if (middleNumber > valueToSearch) {
//                rightPointer = middle - 1;
//            }
//        }
//        return -1;
//    }

    private void binarySearch(int[] arr, int leftPointer, int rightPointer, int valueToSearch) {


        int middle = (leftPointer + rightPointer) / 2;
        int middleNumber = arr[middle];


        if(leftPointer > rightPointer){
            System.out.println("Number not found.");
            return;
         }else if (middleNumber == valueToSearch ) {
            System.out.println("Wanted number exists at index: " + middle);
            return;
        } else if (middleNumber < valueToSearch) {

            leftPointer = middle + 1;

        } else if (middleNumber > valueToSearch) {
            rightPointer = middle - 1;

        }

        binarySearch(arr,leftPointer,rightPointer, valueToSearch);






    }


}
