package org.example.patterns_lesson.patterns.facade;

public class Facade {
    private Projector projector;
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;

    public Facade(Projector projector, Amplifier amplifier, DvdPlayer dvdPlayer) {
        this.projector = projector;
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
    }


    public void watchMovie(String movie) {
        System.out.println("Подготовка к просмотру фильма...");
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }


    public void endMovie() {
        System.out.println("Завершение просмотра фильма...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
    }
}

class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Projector(), new Amplifier(), new DvdPlayer());

        facade.watchMovie("Трансформеры");
    }
}