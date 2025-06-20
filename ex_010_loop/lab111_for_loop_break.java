package ex_010_loop;

public class lab111_for_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) { // 0 to 49, 50 times
            if( i == 5){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
