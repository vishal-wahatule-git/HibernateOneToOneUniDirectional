package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Student;
import com.mapping.helper.HibernateUtility;
////
public class AppUpdateStudent {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s = session.find(Student.class, 1);
		s.setfName("Raghav");
		s.setlName("Khandelwal");

		/*
		 * Here We need to get document first and then set it so it will change value in
		 */
		s.getDocuments().setAadharNo(111111);
		s.getDocuments().setPanNo("XZY111");

		transaction.commit();
		session.close();
	}

}
