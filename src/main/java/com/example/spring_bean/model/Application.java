package com.example.spring_bean.model;

import com.example.spring_bean.TransportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransportConfig.class);
        Driver carDriver = context.getBean("vasiliy", Driver.class);
        carDriver.setTransport(context.getBean("BMW", Car.class));
        Driver busDriver = context.getBean("petrov", Driver.class);
        busDriver.setTransport(context.getBean("Liaz", Bus.class));
        Driver pickupDriver = context.getBean("kirill", Driver.class);
        pickupDriver.setTransport(context.getBean("LandRover", Pickup.class));
        System.out.printf("Всего 3 водителя: %s, %s, %s \n", carDriver, busDriver, pickupDriver);
        busDriver.print();
        pickupDriver.print();
        carDriver.print();
    }

}
