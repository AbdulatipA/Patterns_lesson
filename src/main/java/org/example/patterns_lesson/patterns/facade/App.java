package org.example.patterns_lesson.patterns.facade;

public class App {
}


class Projector {
    public void on() {
        System.out.println("Проектор включен");
    }

    public void setInput(String input) {
        System.out.println("Проектор: Вход установлен на " + input);
    }

    public void off() {
        System.out.println("Проектор выключен");
    }
}

class Amplifier {
    public void on() {
        System.out.println("Усилитель включен");
    }

    public void setVolume(int level) {
        System.out.println("Громкость установлена на " + level);
    }

    public void off() {
        System.out.println("Усилитель выключен");
    }
}

class DvdPlayer {
    public void on() {
        System.out.println("DVD-проигрыватель включен");
    }

    public void play(String movie) {
        System.out.println("Воспроизводится фильм '" + movie + "'");
    }

    public void stop() {
        System.out.println("Фильм остановлен");
    }

    public void off() {
        System.out.println("DVD-проигрыватель выключен");
    }
}