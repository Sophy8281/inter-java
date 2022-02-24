package com.example.javapractice;

public class SelfDrivingCar extends Car {

    public SelfDrivingCar(String chosenColor, String chosenInterior) {
        super(chosenColor, chosenInterior);
        System.out.println("Constructing a self-driving car...");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving to Waiyaki way...");
    }
}
