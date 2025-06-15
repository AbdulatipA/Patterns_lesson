package org.example.patterns_lesson.patterns.adapter;

public class App {
    public static void main(String[] args) {
        LegacyLogger legacyLogger = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacyLogger);

        logger.log("hi");

        ServiceApp serviceApp = new ServiceApp(logger);

    }
}
class ServiceApp{
    Logger logger;

    public ServiceApp(Logger logger) {
        this.logger = logger;
    }
}