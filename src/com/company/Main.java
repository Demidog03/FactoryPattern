package com.company;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new AssaultFactory();
        Character character = factory.createCharacter();
        character.displayName();
        character.displayHP();
        character.displayAbility();
        character.displaySpeed();
        System.out.println("\n");
        factory = new SpyFactory();

        Character character1 = factory.createCharacter();
        character1.displayName();
        character1.displayHP();
        character1.displayAbility();
        character1.displaySpeed();
    }
}
