package org.example.patterns_lesson.patterns.factoryClass;


//абстрактная фабрика
public interface UIFactory {
    Button createButton();
    Window createWindow();
}
