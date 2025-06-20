package ex_010_loop;

public class lab113_for_loop_continue_even_numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // 0 to 50, 51 Times
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd ->" + i);
        }
    }
}
