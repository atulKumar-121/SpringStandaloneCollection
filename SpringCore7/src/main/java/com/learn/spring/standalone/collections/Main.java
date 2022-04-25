package com.learn.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/standalone/collections/config.xml");
		ProductList productlist = (ProductList) ctx.getBean("productlist");
		System.out.println(productlist.toString());
	}

}
