package org.example.patterns_lesson.patterns.factoryClass.macOs;

import org.example.patterns_lesson.patterns.factoryClass.Button;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("Отображаем конопку в стиле MackOS");
    }
}
