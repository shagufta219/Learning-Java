package ex_15_Arrays_Part1;

import java.util.Arrays;

public class lab156_highest_number {
    public static void main(String[] args) {
        //find the second largest in the array

        int[] array = {56,78,98,34,65,76};

        Arrays.sort(array);
        System.out.println(array[array.length-2]);
        System.out.println(array[array.length-3]);
//this is the easiest way
        //can you find without using the sort function?
    }
}
