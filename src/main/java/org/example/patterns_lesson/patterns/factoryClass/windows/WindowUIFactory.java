package org.example.patterns_lesson.patterns.factoryClass.windows;

import org.example.patterns_lesson.patterns.factoryClass.Button;
import org.example.patterns_lesson.patterns.factoryClass.UIFactory;
import org.example.patterns_lesson.patterns.factoryClass.Window;

public class WindowUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
