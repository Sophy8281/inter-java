package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {

//        System.out.println("Launching car simulator....");
//
//        Car myToyota = new Car("Blue", "Wood");
//
//        //System.out.println("The color of the car is " + myToyota.color);
//
//        // Accessing the color static variable directly from the class without having to create an object
//        System.out.println("The color of the car is " + Car.color);
//
//        System.out.println("mToyota has " + myToyota.getmNumberOfSeats() + "seats");
//
//        Car myHonda = new Car();
//
//        //System.out.println(myHonda.color + "Honda with red " + myHonda.getmInterior() + " interior");
//
//        // Accessing the color static variable directly from the class without having to create an object
//        System.out.println(Car.color + "Honda with red " + myHonda.getmInterior() + " interior");
//
//        Car.color = "Pink";
//        System.out.println("myToyota's color is " + Car.color);
//        System.out.println("myHonda's color is " + Car.color);
//
//        myToyota.drive();


        System.out.println("Launching car simulator....");

        Car myToyota = new Car("Blue", "Wood");
        Car myHonda = new Car();

        myToyota.drive();

        SelfDrivingCar autobot = new SelfDrivingCar("Yellow", "Plastic");
        System.out.println("My autobot car is " + autobot.color + " in color and has a " + autobot.mInterior + " interior.");

        autobot.drive();
    }
}