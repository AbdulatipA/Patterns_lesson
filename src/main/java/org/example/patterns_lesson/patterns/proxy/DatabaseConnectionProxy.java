package org.example.patterns_lesson.patterns.proxy;

public class DatabaseConnectionProxy implements DatabaseConnection {
    private RealDatabaseConnection realDatabaseConnection;
    private String user;
    private String password;


    @Override
    public void connect() {
        if (authentication(user, password)) {
            if (realDatabaseConnection == null) {
                System.out.println("Создаем соедение в первый раз");
                realDatabaseConnection = new RealDatabaseConnection();
            }
            realDatabaseConnection.connect();
        } else {
            System.out.println("Неверный логин или пароль");
        }
    }


    public DatabaseConnectionProxy(String user, String password) {
        this.user = user;
        this.password = password;
    }


    boolean authentication(String user, String password) {
        if (user.equals("admin") && password.equals("12345")) {
            return true;
        }
        return false;
    }
}
