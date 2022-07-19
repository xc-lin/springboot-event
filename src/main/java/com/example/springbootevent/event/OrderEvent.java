package com.example.springbootevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
public class OrderEvent extends ApplicationEvent implements IEvent{

    private String  orderId;

    public OrderEvent(Object source, String orderId) {
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
