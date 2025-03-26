package com.example.demo;

import com.example.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JUnit5Test {

    @Autowired
    private MyService myService;

    @Test
    void testPerformAction() {
        assertEquals("real-behavior", myService.performAction());
    }
}