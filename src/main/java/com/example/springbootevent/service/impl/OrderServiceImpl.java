package com.example.springbootevent.service.impl;

import com.example.springbootevent.event.IEvent;
import com.example.springbootevent.event.OrderEvent;
import com.example.springbootevent.event.OrderEventAnnotation;
import com.example.springbootevent.event.OrderEventAsync;
import com.example.springbootevent.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService, ApplicationContextAware {
    ApplicationContext applicationContext;

    @Override
    public void placeAnOrder() {
        processOrder(new OrderEvent(this, UUID.randomUUID().toString()));
    }

    @Override
    public void placeAnOrderAnnotation() {
        processOrder(new OrderEventAnnotation(this, UUID.randomUUID().toString()));
    }

    @Override
    public void placeAnOrderAsync() {
        processOrder(new OrderEventAsync(this, UUID.randomUUID().toString()));

    }

    private void processOrder(IEvent event){
        log.info("----开始下单----");
        applicationContext.publishEvent(event);
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("----下单结束----");

    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
