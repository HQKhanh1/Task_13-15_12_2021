package com.example.beanscopes.Application;

public class HelloMessageGenerator {
    private String message;

    public HelloMessageGenerator() {
    }

    public HelloMessageGenerator(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
