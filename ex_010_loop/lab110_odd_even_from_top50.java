package ex_010_loop;

public class lab110_odd_even_from_top50 {
    public static void main(String[] args) {
        //  Find the even numbers from 1 to 50.
        for (int i = 1; i <= 50 ; i++) {  // 1 to 50 . Times -> 50
            // i%2 ==0
            if(i%2 == 0){
                System.out.println("even! -> " + i);
            }
        }
    }
}
