package br.com.camilolopes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.camilolopes.classes.SpringHelloWorld;

public class Main {
	public static void main(String[] args) {
//		essa classe é o container 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"conf/springconfiguration.xml");
		SpringHelloWorld bean = (SpringHelloWorld) applicationContext.getBean("hello");
		bean.showHelloWorld();
	}
}
