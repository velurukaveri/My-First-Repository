package com.app.javaLearn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	public static void main(String[] args)
	{
		Resource res = new ClassPathResource("com/app/javaLearn/xmlconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Object o = factory.getBean("id1");
		WelcomeBean wb = (WelcomeBean)o;

		wb.show();
	}

}