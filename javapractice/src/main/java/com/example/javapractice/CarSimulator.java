package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {

        System.out.println("Launching car simulator....");

        Car myToyota = new Car("Blue");
        System.out.println("The color of the car is " + myToyota.color);

        System.out.println("mToyota has " + myToyota.getmNumberOfSeats() + "seats");
    }
}