package ex_19_oops_multi_inheritence;

import ex_19_oops_Single_inheritence.Son;

public class Lab184_Multil_LEVLEL {
    public static void main(String[] args) {
        // Son s1 = new Father();
        //  Son s1 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
