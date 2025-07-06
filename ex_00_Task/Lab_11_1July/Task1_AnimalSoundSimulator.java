/*
✅ Task 1: "Animal Sound Simulator"

📄 Description:  (Single Inheritance + Method Call)

 Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow().
  In the main method, call both methods using the Cat object.


 */

package ex_00_Task.Lab_11_1July;

public class Task1_AnimalSoundSimulator {
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.makeSound();
        c.meow();
    }
}

class Animal
{
    void makeSound()
    {
        System.out.println("Animal Make sound");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat Meow");
    }
}
