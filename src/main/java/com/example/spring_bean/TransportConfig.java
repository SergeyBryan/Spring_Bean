package com.example.spring_bean;

import com.example.spring_bean.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransportConfig {

    @Bean(name = "BMW")
    public Transport getCar() {
        System.out.println("Новая легковая машина готова к работе");
        return new Car("BMW");
    }

    @Bean(name = "LandRover")
    public Transport getPickup() {
        System.out.println("Новый пикап готов к работе");
        return new Pickup("LandRover");
    }

    @Bean(name = "Liaz")
    public Transport getBus() {
        System.out.println("Новый автобус готов к работе");
        return new Bus("Liaz");
    }

    @Bean(name = "vasiliy")
    public Driver getCarDriver(@Qualifier("BMW") Transport transport) {
        return new Driver("Василий", transport);
    }

    @Bean(name = "petrov")
    public Driver getBusDriver(@Qualifier("Liaz") Transport transport) {
        return new Driver("Петя", transport);
    }

    @Bean(name = "kirill")
    public Driver getPickupDriver(@Qualifier("LandRover") Transport transport) {
        return new Driver("Кирилл", transport);
    }

}

