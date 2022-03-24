package com.app.javaLearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	
	@Bean(name="countryObj")
	public Country getCountry()
	{
		Country country=new Country("India","Andhrapradesh","Nellore","A.c.nagar");
		
		return country;
		
	}

}
