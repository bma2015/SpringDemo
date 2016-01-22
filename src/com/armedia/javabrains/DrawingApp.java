package com.armedia.javabrains;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		
		Polygon polygon = (Polygon) context.getBean("polygon");
		polygon.draw();
		
		AutowiredTriangle autoTriangle = (AutowiredTriangle) context.getBean("autoTriangle");
		autoTriangle.draw();
		
		AutowiredTriangleAware autoTriangleAware = (AutowiredTriangleAware) context.getBean("autoTriangleAware");
		autoTriangleAware.draw();		
	}

}
