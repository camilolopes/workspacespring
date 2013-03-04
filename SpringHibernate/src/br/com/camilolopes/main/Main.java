package br.com.camilolopes.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.camilolopes.classes.Spring;
import br.com.camilolopes.classes.SpringDAO;

public class Main {
	public static void main(String[] args) {
//		essa classe é o container 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"conf/springconfiguration.xml");
		SpringDAO bean = (SpringDAO) applicationContext.getBean("springDAO");
		Spring spring = new Spring();
		spring.setName("teste 1");
		System.out.println(bean.save(spring));
	}
}
