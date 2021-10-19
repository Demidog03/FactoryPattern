package com.company;

public class BomberFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Bomber();
    }
}
