package com.app.javaLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
	
	public static void main(String[] args) {
		  @SuppressWarnings("resource")
		  ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		  Country countryObj = (Country) appContext.getBean("countryObj");
		  
		 
		  System.out.println("Country name: "+ countryObj);
		 }
	
	
	

}
