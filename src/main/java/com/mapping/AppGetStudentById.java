package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Documents;
import com.mapping.Entity.Student;
import com.mapping.helper.HibernateUtility;

public class AppGetStudentById {

	public static void main(String[] args) {
		System.out.println("Get Data by Id");
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = 1;
		Student student = session.find(Student.class, id);

		transaction.commit();
		session.close();
		System.out.println("DATA for student with id " + id + " : " + student.toString());
	}

}
