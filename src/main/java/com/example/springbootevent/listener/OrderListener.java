package com.example.springbootevent.listener;

import com.example.springbootevent.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
@Slf4j
@Component
public class OrderListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent event) {
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
