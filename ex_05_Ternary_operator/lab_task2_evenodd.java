package ex_05_Ternary_operator;

public class lab_task2_evenodd {
    public static void main(String[] args) {
        int num = 20;
        String result = (num%2==0) ? num+"is even": num+"is odd";
        System.out.println(result);
    }
}
