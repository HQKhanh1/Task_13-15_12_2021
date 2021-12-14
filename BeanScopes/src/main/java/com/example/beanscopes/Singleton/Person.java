package com.example.beanscopes.Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    @Scope("singleton")
    public Person personSingleton() {
        return new Person();
    }
}
