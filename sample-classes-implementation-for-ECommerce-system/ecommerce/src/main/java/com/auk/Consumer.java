package com.auk;

import java.util.ArrayList;
import java.util.List;

public class Consumer extends Customer{
    private int totalOrders;

    public int calculateTotalOrders(){
        return totalOrders;
    }
    private Cart cart;
    public Cart getCart(){
        return cart;
    }
    private List<Order> orderList;
    public Order[] getOrderList(){
        return orderList.toArray(new Order[orderList.size()]);
    }
    public void placeOrder(){
        Order o = new Order(this,cart.getProducts());
        cart.clear();
        orderList.add(o);
    }
    public Consumer(String n)
    {
        super(n);
        cart = new Cart(this);
        orderList = new ArrayList<Order>();
    }
}
