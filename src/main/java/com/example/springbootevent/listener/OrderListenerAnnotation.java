package com.example.springbootevent.listener;

import com.example.springbootevent.event.OrderEvent;
import com.example.springbootevent.event.OrderEventAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
@Slf4j
@Component
public class OrderListenerAnnotation {

    @EventListener({OrderEventAnnotation.class})
    public void onApplicationEvent(OrderEventAnnotation event) {
        log.info("---监听到，开始处理---");
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(event.getSource().getClass().toString());
        log.info(event.getOrderId().toString());
        log.info("---监听到，结束处理---");
    }
}
