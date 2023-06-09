package com.example.spring_bean.model;

import com.example.spring_bean.TransportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransportConfig.class);
        Driver carDriver = context.getBean("vasiliy", Driver.class);
        Driver busDriver = context.getBean("petrov", Driver.class);
        Driver pickupDriver = context.getBean("kirill", Driver.class);
        System.out.printf("Всего 3 водителя: %s, %s, %s \n", carDriver, busDriver, pickupDriver);
        busDriver.print();
        pickupDriver.print();
        carDriver.print();
    }

}
