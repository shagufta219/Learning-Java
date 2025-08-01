/*
✅ Task 2: "Vehicle Constructor Chain"

📄 Description:

Create a class Vehicle with a constructor that prints "Vehicle is ready".
Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
 Create an object of Bike in the main method and observe constructor call order.
 */

package ex_00_Task.Lab_11_1July;

public class Task2_VehicleConstructorChain {
    public static void main(String[] args)
    {
        Bike bike =new Bike();
    }
}


class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle
{
    Bike()
    {
        System.out.println("Bike is ready");
    }
}
