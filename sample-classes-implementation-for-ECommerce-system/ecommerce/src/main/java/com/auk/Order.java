package com.auk;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Order {
    private Consumer owner;
    private List<OrderLine> products;
    private Date date;
    public OrderLine[] getProducts(){
        return products.toArray(new OrderLine[products.size()]);
    }
    public Consumer getBuyer(){
        return owner;
    }
    public Date getDate(){
        return date;
    }
    public Order(Consumer c, OrderLine[] p){
        owner = c;
        products = Arrays.asList(p);
        date = new Date();
    }
}
