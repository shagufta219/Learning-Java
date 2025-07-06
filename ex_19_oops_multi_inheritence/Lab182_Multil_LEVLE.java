package ex_19_oops_multi_inheritence;

public class Lab182_Multil_LEVLE {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");


        son s1 = new son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
