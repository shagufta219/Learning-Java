package ex_14_String;

public class lab141_bigger_interview_question {
    public static void main(String[] args) {
        String s1="hello";
        String s4="hello";
        String s3="hello";

        String s2=new String("hello");
        String s7=new String("Hello");
        String s5=new String("hello");
        System.out.println(s1==s5);//comparison->String->this check the locations ref.


        //EqualsIgnoreCase->
        System.out.println(s1.equals(s7));
        System.out.println(s5.equals(s2));
        System.out.println(s3.equalsIgnoreCase(s7));

//Equalignorecase-> pramod,PRAMOD,praMod,pramoD->pramod
        //check for the ref
        //= assignment the value


    }
}
