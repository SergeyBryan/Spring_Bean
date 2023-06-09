package com.example.spring_bean.model;

import lombok.ToString;

@ToString
public class Driver {

    private String name;
    private Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void print() {
        System.out.println(name + " сел в " + transport.getModel() + " и поехал");
    }

}
