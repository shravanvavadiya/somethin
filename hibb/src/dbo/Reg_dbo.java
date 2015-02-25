package dbo;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import vao.Reg_vao;



public class Reg_dbo {
	
	public void insert(Reg_vao rv){

//		SessionFactory sessionFactory=new Configuration().configure()).addClass(Reg_vao.class).buildSessionFactory();
		SessionFactory sessionFactory=new Configuration().configure().addClass(Reg_vao.class).buildSessionFactory();
		Session s=sessionFactory.openSession();
		
		Transaction tr=s.beginTransaction();
		s.save(rv);
		tr.commit();
	}
	

}
