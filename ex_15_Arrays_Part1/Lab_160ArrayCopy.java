package ex_15_Arrays_Part1;

public class Lab_160ArrayCopy {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);

    }
}
