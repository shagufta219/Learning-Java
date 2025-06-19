package ex_013_funtions;
import java.util.Scanner;
public class lab131_grade_scale {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks");
        int score=sc.nextInt();
        if(score>=90 && score<=100) {
            System.out.println("your grade is A");
        }
            else if(score>=80 && score<=90){
                System.out.println("your grade is B");
            }
    else if (score >= 70 && score <= 79) {
        System.out.println("Your grade is C");
    } else if (score >= 60 && score <= 69) {
        System.out.println("Your grade is D");
    } else if (score >= 0 && score <= 59) {
        System.out.println("Your grade is F");
    } else {
        System.out.println("Invalid score! Please enter a number between 0 and 100.");
    }

    }
}
