package com.clifav.main;

import com.clifav.beans.Vehicle;
import com.clifav.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {


        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle veh= context.getBean(Vehicle.class); Throws No Unique Bean Definition

        Vehicle veh1= context.getBean("mercedez",Vehicle.class);

        System.out.println(veh1.getName());

        Vehicle veh2= context.getBean("audi",Vehicle.class);

        System.out.println(veh2.getName());

        Vehicle veh3= context.getBean("bmw",Vehicle.class);

        System.out.println(veh3.getName());

//        String hello= context.getBean(String.class);
//
//        System.out.println(hello);
//
//        Integer number= context.getBean(Integer.class);
//
//        System.out.println(number);

        //Git Testing

    }
}
