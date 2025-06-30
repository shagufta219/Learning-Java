package ex_15_Arrays_Part1;

public class lab_150_Arrays2 {;
    public static void main(String[] args) {
        int[] marks1 = {56,78,89,45,78,90}; //first way

        //2nd way to write Arrays
        int[] marks2 = new int[4];

        String[]  names = new String[4];
        names[0] = "saba";
        names[1] = "ansari";
        names[2] = "shagufta";
        System.out.println(names[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[2]);
    }
}
