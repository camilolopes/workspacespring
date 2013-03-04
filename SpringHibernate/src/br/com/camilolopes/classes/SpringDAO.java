package br.com.camilolopes.classes;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class SpringDAO {
	/*
	 * esse é o cara que cuida de tudo, obter a transação, iniciar 
	 * fechar e persistir
	 */
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public long save(Spring spring){
	 long cod = 	(Long) hibernateTemplate.save(spring);
	 return cod;
	}
}
