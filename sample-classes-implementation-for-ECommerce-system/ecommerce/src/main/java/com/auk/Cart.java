package com.auk;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Consumer owner;
    private List<OrderLine> products;
    public OrderLine[] getProducts(){
        return products.toArray(new OrderLine[products.size()]);
    }
    public void addProduct(Product p, int q){
        OrderLine l = new OrderLine(owner, p);
        l.setQuantity(q);
        products.add(l);
    }
    public void clear(){
        products.clear();
    }
    public Cart(Consumer c){
        products = new ArrayList<OrderLine>();
        owner = c;
    }
}
