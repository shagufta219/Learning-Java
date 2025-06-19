import java.util.Scanner;
public class lab128_tocheck_char_vowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a character");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='0'|| ch=='u'){
            System.out.println(ch + "is vowel");
        }
else if(ch=='a'&& ch=='z'){
            System.out.println(ch + "is not vowel");
        }
else{
            System.out.println("invalid char!");
        }
    }
}
