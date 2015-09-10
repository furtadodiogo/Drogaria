package br.org.daniel.drogaria.main;

import org.hibernate.Session;

import br.org.daniel.drogaria.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getFabricaDeSessoes().openSession();
		session.close();
		
		HibernateUtil.getFabricaDeSessoes().close();
		

	}

}
