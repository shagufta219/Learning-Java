package ex_013_funtions;
import java.util.Scanner;

public class lab131_leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + "is leap year");
        }
        else{
            System.out.println(year+ " is not leap year");
        }

    }
}
