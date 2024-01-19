package com.rays.dto;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UserTest {

	public static void main(String[] args) {

		//testadd();
		 testupdate();
		
	}

	private static void testupdate() {
		
		UserDTO dto = new UserDTO();
		
		dto.setId(4);
		dto.setFirstname("Shubham");
		dto.setLastname("kumar");
		dto.setLoginId("shubham@gmail.com");
		dto.setPassword("1234");
		dto.setDob(new Date());
		dto.setAddress("bhopal");
		
		UserModel model = new UserModel();
		
		model.update(dto);

//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		
//		Session session= sf.openSession();
//		
//		Transaction tx = session.beginTransaction();
//		
//		session.update(dto);
//		tx.commit();
//		
//		session.close();
	}

	private static void testadd() {

		
		UserDTO dto = new UserDTO();
		
		
        
		dto.setFirstname("Gopal");
		dto.setLastname("Malviya");
		dto.setLoginId("gopal@gmail.com");
		dto.setPassword("1234");
		dto.setDob(new Date());
		dto.setAddress("Khargoon");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();
		session.close();
	}

}
