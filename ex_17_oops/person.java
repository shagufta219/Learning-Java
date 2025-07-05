package ex_17_oops;

public class person {
    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;


    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("Eating " + food);
    }

    String sleep(){
        System.out.println("Sleeping");
        return "Slept well";
    }

    String food(int a){
        System.out.println(a);
        return null;
    }


}
