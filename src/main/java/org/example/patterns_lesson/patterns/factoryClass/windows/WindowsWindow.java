package org.example.patterns_lesson.patterns.factoryClass.windows;

import org.example.patterns_lesson.patterns.factoryClass.Window;

public class WindowsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Открывает окно в стиле Windows");
    }
}
