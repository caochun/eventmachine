package com.example.eventmachine;

import org.apache.commons.scxml2.model.ModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EventMachineApplication implements CommandLineRunner {

    ApplicationContext applicationContext;

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) throws ModelException {
        SpringApplication.run(EventMachineApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception {
        System.setProperty("java.awt.headless", "false");
        new StopWatchDisplay(applicationContext.getBeansOfType(StateDelegate.class).values());
    }

}
