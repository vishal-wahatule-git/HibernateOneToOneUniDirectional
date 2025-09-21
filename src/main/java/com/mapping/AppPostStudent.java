package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Documents;
import com.mapping.Entity.Student;
import com.mapping.helper.HibernateUtility;



public class AppPostStudent 
{
    public static void main( String[] args )
    {
        System.out.println( "Saving Data" );
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        // Documents
        Documents documents = new Documents();
        documents.setAadharNo(369852);
        documents.setPanNo("ABC4576ED");
        
        //Student
        Student s = new Student();
        s.setfName("SUYASH");
        s.setlName("DHAJEKAR");
        s.setDocuments(documents);

        session.persist(s);
        
        transaction.commit();
        session.close();
        System.out.println("DATA SAVED");
    }
}
