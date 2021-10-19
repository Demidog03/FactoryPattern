package com.company;

public class Spy implements Character{
    @Override
    public void displayName() {
        System.out.println("Spy");
    }

    @Override
    public void displayAbility() {
        System.out.println("Very low volume of sound of steps");
    }

    @Override
    public void displayHP() {
        System.out.println("80");
    }

    @Override
    public void displaySpeed() {
        System.out.println("15m/s");
    }
}
