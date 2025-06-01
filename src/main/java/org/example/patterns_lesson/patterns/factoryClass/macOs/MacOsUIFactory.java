package org.example.patterns_lesson.patterns.factoryClass.macOs;

import org.example.patterns_lesson.patterns.factoryClass.Button;
import org.example.patterns_lesson.patterns.factoryClass.UIFactory;
import org.example.patterns_lesson.patterns.factoryClass.Window;

public class MacOsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }
}
