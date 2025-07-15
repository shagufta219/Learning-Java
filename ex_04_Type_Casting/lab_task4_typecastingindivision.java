package ex_04_Type_Casting;

public class lab_task4_typecastingindivision {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float Caution = (float) (a / b); //Compare this statement with other 3
        System.out.println(Caution);

        float Result = (float) a / (float) b;
        System.out.println(Result);
        //or
        Result = (float) a / b;
        System.out.println(Result);
        //or
        Result = a / (float) b;
        System.out.println(Result);
    }
}
