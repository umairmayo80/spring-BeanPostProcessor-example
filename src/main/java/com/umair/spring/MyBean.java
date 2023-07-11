package com.umair.spring;


public class MyBean {
    private String greeting;

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void sayHello() {
        System.out.println(greeting);
    }
}
