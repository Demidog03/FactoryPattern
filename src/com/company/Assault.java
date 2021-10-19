package com.company;

public class Assault implements Character {
    @Override
    public void displayName() {
        System.out.println("Assault");
    }

    @Override
    public void displayAbility() {
        System.out.println("Large amount of ammunition ");
    }

    @Override
    public void displayHP() {
        System.out.println("100");
    }

    @Override
    public void displaySpeed() {
        System.out.println("90m/s");
    }
}
