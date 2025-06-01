package org.example.patterns_lesson.patterns.proxy;

public class RealDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Подключение к базе данных, подождите...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Успешное подключение!");
    }
}