package com.auk;

public class Customer {
    protected int id;
    protected String name;
    protected String address;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public Customer(String n){
        name = n;
    }
}
