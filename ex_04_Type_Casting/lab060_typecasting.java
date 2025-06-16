package ex_04_Type_Casting;

public class lab060_typecasting {
    public static void main(String[] args) {
        long phone =9876543210l;
        //short s =phone; // implicit narrow? //no
        short s1=(short)phone; //explicit narrow
    }
}
