package ex_15_Arrays_Part1;

public class lab155_sum_of_arrays {
    public static void main(String[] args) {
        int[] numbers = {45,67,89};
        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
            System.out.println(sum);

    }
}
