package com.example.springbootevent;

import com.example.springbootevent.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootEventApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }
    @Test
    void testEvent1(){
        orderService.placeAnOrder();
    }

    @Test
    void testEvent2(){
        orderService.placeAnOrderAnnotation();
    }

    @Test
    void testEventAsync(){
        orderService.placeAnOrderAsync();
    }
}
