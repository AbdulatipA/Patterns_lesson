package org.example.patterns_lesson.patterns.factoryClass;

public class Application {
    private Button button;
    private Window window;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.window = uiFactory.createWindow();
    }

    public void run() {
        window.open();
        button.render();
    }
}
