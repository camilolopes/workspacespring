package br.com.camilolopes.bean;

import java.math.BigDecimal;

public class Client  {

	public void sacar(BigDecimal value) {
		System.out.println("Saque realizado com sucesso " + value);
	}
	
	public void depositar(BigDecimal value) {
		System.out.println("Deposito realizado " + value);
	}

}
