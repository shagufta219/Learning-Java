package ex_013_funtions;

public class lab131_user_defined_one {
    public static void main(String[] args) {
        int result = Sum_of_numbers(3, 6);
        sum_of_number_no_return(3,5);
            System.out.println(result);
        }

        static int Sum_of_numbers( int a, int b) {
     return a+b;
    }
        static void sum_of_number_no_return(int a , int b){
            System.out.println(a+b);
        }



    }
