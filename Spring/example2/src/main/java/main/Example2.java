package main;

import com.clifav.beans.Vehicle;
import com.clifav.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {


        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle veh= context.getBean(Vehicle.class); Throws No Unique Bean Definition

        Vehicle veh= context.getBean("vehicle2",Vehicle.class);

        System.out.println(veh.getName());

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
