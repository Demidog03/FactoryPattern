package com.company;

public class AssaultFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Assault();
    }
}
