package com.example.javapractice;

public class Car {

    // public String color = "Black";

    // Static allow accessing the color variable directly from the class without having to create an object
    public static String color = "Black";
    private int mNumberOfSeats = 5;
    private String mInterior;

    // Default Constructor
    public Car() {

        mInterior = "Leather";
    }

    public  Car(String chosenColor, String chosenInterior) {
        color = chosenColor;
        mInterior = chosenInterior;
    }

    public int getmNumberOfSeats() {
        return mNumberOfSeats;
    }

    public String getmInterior() {
        return mInterior;
    }

    public void drive(){
        System.out.println("Car is moving...");
    }
}
