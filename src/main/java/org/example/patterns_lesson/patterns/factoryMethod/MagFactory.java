package org.example.patterns_lesson.patterns.factoryMethod;

import org.springframework.data.mapping.FactoryMethod;

public class MagFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mag();
    }
}
