package com.company;

public class SpyFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Spy();
    }
}
