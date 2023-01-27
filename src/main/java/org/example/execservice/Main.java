package org.example.execservice;

import java.util.concurrent.ExecutorService;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean("executorService", ExecutorService.class);
        applicationContext.close();
    }
}
