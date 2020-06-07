package com.murtaza.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Vehicle v=new Bike(); v.running();
		 */
		/*
		 * VehicleHelper vh=new VehicleHelper(); vh.vehicleRunner();
		 */
    	ApplicationContext context=new ClassPathXmlApplicationContext("AppConfig.xml");
    	VehicleHelper vh=(VehicleHelper) context.getBean("VehicleHelper");
    	vh.vehicleRunner();
    }
}
