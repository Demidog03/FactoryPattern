package com.company;

public class DefenderFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Defender();
    }
}
