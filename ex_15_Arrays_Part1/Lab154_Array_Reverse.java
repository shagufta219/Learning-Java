package ex_15_Arrays_Part1;

public class Lab154_Array_Reverse {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        for (int i = marks.length-1;  i >=0; i--) {
            System.out.println(marks[i]);
        }
    }
}
