package com.git.flow.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    public void test(){
        System.out.println("Test");
    }
    public void test2(){
        System.out.println("Test");
    }

}
