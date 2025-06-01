package org.example.patterns_lesson.patterns;

import org.example.patterns_lesson.patterns.proxy.DatabaseConnection;
import org.example.patterns_lesson.patterns.proxy.DatabaseConnectionProxy;
import org.example.patterns_lesson.patterns.proxy2.VideoService;
import org.example.patterns_lesson.patterns.proxy2.VideoServiceProxy;

public class Main {
    public static void main(String[] args) {
//        DatabaseConnection databaseConnection = new DatabaseConnectionProxy("admin", "12345");
//        databaseConnection.connect();
//        System.out.println("/////////////////////");
//        databaseConnection.connect();


        VideoService videoService = new VideoServiceProxy();
        videoService.playMusic();
    }
}
