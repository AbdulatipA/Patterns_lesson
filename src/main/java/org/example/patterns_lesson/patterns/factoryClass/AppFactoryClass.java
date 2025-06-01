package org.example.patterns_lesson.patterns.factoryClass;

import org.example.patterns_lesson.patterns.factoryClass.macOs.MacOsUIFactory;
import org.example.patterns_lesson.patterns.factoryClass.windows.WindowUIFactory;

public class AppFactoryClass {
    public static void main(String[] args) {
        UIFactory uiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) {
            uiFactory = new WindowUIFactory();
        } else if (osName.contains("mac")) {
            uiFactory = new MacOsUIFactory();
        } else {
            throw new RuntimeException("Неизвестая ОС");
        }

        Application application = new Application(uiFactory);
        application.run();

    }
}
