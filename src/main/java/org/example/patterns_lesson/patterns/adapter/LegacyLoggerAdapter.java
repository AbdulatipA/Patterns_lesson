package org.example.patterns_lesson.patterns.adapter;

public class LegacyLoggerAdapter implements Logger {
    LegacyLogger legacyLogger;


    @Override
    public void log(String message) {
        legacyLogger.writeLog(message);
    }

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }
}
