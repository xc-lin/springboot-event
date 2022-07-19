package com.example.springbootevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
public class OrderEventAnnotation  implements IEvent{

    private String  orderId;
    private Object source;

    public OrderEventAnnotation(Object source,String orderId) {
        this.orderId = orderId;
        this.source = source;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
