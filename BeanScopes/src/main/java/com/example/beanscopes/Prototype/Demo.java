package com.example.beanscopes.Prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Message msgA = (Message) context.getBean("Hi! World");

        msgA.setMessage("This is message A");
        msgA.getMessage();

        Message msgB = (Message) context.getBean("Hi! World");
        msgB.getMessage();
    }
}
