package org.example.patterns_lesson.patterns.factoryMethod;

public class WarriorFactory extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
