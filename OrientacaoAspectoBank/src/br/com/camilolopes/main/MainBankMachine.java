package br.com.camilolopes.main;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.camilolopes.bean.Client;

public class MainBankMachine {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf/springconfiguration.xml");
		Client bean = (Client) applicationContext.getBean("client");
		bean.sacar(BigDecimal.TEN);
		bean.depositar(BigDecimal.ONE);
	}
}
