package org.example.patterns_lesson.patterns.factoryMethod;

public class AppFactoryMethod {
    public static void main(String[] args) {
        CharacterFactory factory;

        factory = new MagFactory();
        Character character = factory.createCharacter();
        character.attack();

        factory = new WarriorFactory();
        Character character2 = factory.createCharacter();
        character2.attack();
    }
}
