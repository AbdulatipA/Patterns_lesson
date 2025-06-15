package org.example.patterns_lesson.patterns.adapter;

public class LegacyLogger {
    public void writeLog(String data) {
        System.out.println("LegacyLogSystem: Записано: " + data);
    }
}
