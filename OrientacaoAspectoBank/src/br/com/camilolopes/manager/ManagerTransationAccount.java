package br.com.camilolopes.manager;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ManagerTransationAccount {
	@Pointcut("execution(* *.sacar(..))")
	public void transacao(){}
	
	@Before("transacao()")
	public void saque(){
//		poderia logar a info no arquivo de log
		System.out.println("Transação de saque inicializada");
	}
	@AfterReturning("transacao()")
	public void retirada(){
		System.out.println("Transação de saque concluida com sucesso");
	}
	
	@Pointcut("execution(* *.depositar(..))")
	public void deposito(){}
	
	@Before("deposito()")
	public void depositar(){
		System.out.println("Transação de deposito iniciada");
	}
	
	@AfterReturning("deposito()")
	public void depositado(){
		System.out.println("deposito realizado com sucesso");
	}
}
