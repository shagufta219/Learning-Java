package ex_15_Arrays_Part1;

import java.util.Arrays;

public class lab_151_Arraysprint {
    public static void main(String[] args) {
        int[] marks = {67,89,56,45,35,84};
        System.out.println("---------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

            Arrays.sort(marks);

            for (int j =0; j<marks.length; j++) {
                System.out.println(marks[j]);

            }


        }
    }
}
