package org.example.patterns_lesson.patterns.factoryClass.macOs;

import org.example.patterns_lesson.patterns.factoryClass.Window;

public class MacOsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Открывает окно в стиле MacOS");
    }
}
