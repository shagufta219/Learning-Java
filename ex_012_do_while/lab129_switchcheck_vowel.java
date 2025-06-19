package ex_012_do_while;
import java.util.Scanner;
public class lab129_switchcheck_vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Vowel");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'a','e','i','o','u':
        System.out.println("vowel");
            break;
            default:
                System.out.println("consonents");
        }
    }
}
