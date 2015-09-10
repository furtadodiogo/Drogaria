package br.org.daniel.drogaria;

import org.hibernate.Session;
import org.junit.Test;

import br.org.daniel.drogaria.util.HibernateUtil;

public class HibernateUtilTest {
	
	@Test
	public void conecta(){
		
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		session.close();
		
		HibernateUtil.getFabricaDeSessoes().close();
		
	}

}
