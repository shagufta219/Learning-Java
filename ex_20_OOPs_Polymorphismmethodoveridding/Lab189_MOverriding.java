package ex_20_OOPs_Polymorphismmethodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("Default Sound!");
    }

    void A(){}
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
    }

    void methodOverLoad(){

    }

    void methodOverLoad(int a){

    }




}