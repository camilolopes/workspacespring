package br.com.camilolopes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.camilolopes.classes.CentralMachine;

public class Main {
	public static void main(String[] args) {
//		essa classe é o container 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"conf/springconfiguration.xml");
	 CentralMachine bean = (CentralMachine) applicationContext.getBean("centralMachine");
		bean.register();
	
	}
}
