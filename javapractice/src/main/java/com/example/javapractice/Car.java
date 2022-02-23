package com.example.javapractice;

public class Car {

    public String color = "Black";
    private int mNumberOfSeats = 5;

    public Car() {
        // Constructor
    }

    public  Car(String chosenColor) {
        color = chosenColor;
    }

    public int getmNumberOfSeats() {


        return mNumberOfSeats;
    }


}
