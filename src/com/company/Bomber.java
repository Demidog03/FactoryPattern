package com.company;

public class Bomber implements Character{
    @Override
    public void displayName() {
        System.out.println("Bomber");
    }

    @Override
    public void displayAbility() {
        System.out.println("Has several types of incendiary and explosive grenades. ");
    }

    @Override
    public void displayHP() {
        System.out.println("150");
    }

    @Override
    public void displaySpeed() {
        System.out.println("12m/s");
    }
}
