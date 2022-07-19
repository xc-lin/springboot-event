package com.example.springbootevent.event;

/**
 * @author Frank_lin
 * @date 2022/7/19
 */
public class OrderEventAsync implements IEvent{

    private String  orderId;
    private Object source;

    public OrderEventAsync(Object source, String orderId) {
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
