package com.example.beanscopes.Singleton;

import com.example.beanscopes.Prototype.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

//@SpringBootApplication
public class Demo {
    private static final String NAME = "KHANH";


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Person personA = (Person) context.getBean("personSingleton");

        personA.setName(NAME);
        System.out.println(personA.getName());

        Person personB = (Person) context.getBean("personSingleton");
        System.out.println(personB.getName());
    }
}
