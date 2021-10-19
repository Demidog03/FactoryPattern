package com.company;

public class Defender implements Character{
    @Override
    public void displayName() {
        System.out.println("Defender");
    }

    @Override
    public void displayAbility() {
        System.out.println("Repeated use of the shield.");
    }

    @Override
    public void displayHP() {
        System.out.println("120");
    }

    @Override
    public void displaySpeed() {
        System.out.println("7m/s");
    }
}
