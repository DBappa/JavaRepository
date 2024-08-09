package com.clifav.config;


import com.clifav.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.clifav.beans")
public class ProjectConfig {

//    @Bean(name="bmw")
//    Vehicle vehicle1(){
//        var vehicle=new Vehicle();
//        vehicle.setName("BMW");
//        return vehicle;
//    }

//    @Bean
//    String hello(){
//        return "Hello World";
//    }
//
//    @Bean
//    Integer number(){
//        return 16;
//    }

//    @Bean(value = "audi")
//    @Primary
//    Vehicle vehicle2(){
//        var vehicle=new Vehicle();
//        vehicle.setName("Audi");
//        return vehicle;
//    }

//    @Bean("mercedez")
//    Vehicle vehicle3(){
//        var vehicle3=new Vehicle();
//        vehicle3.setName("Mercedez");
//        return vehicle3;
//    }


}
