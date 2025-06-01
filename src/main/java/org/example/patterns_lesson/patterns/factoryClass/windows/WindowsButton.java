package org.example.patterns_lesson.patterns.factoryClass.windows;

import org.example.patterns_lesson.patterns.factoryClass.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Отображаем конопку в стиле Windows");
    }
}
