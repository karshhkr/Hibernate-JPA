package com.lcwd.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lcwd.hibernate.entities.Student;
import com.lcwd.hibernate.util.HibernateUtil;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("we are going to learn hibernate");
    
    //student create
        //save: hibernate
        
        //crreate Student obj
        
         Student student =new Student() ;
         student.setName("Utkarsh Kumar");
         student.setActive(true);
         student.setPhone("1234567890");
         student.setFatherName("Yogendra Kuamr");
         student.setAbout("this is dummy student");
         student.setcollegeName("Tulas University");
         
        	 
         
   SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    System.out.println(sessionFactory);  
    
    
     Session session =sessionFactory.openSession();
    Transaction transaction=null;
    
     try {
    	 transaction = session.beginTransaction();
    	 session.persist(student);
    	 transaction.commit();
    	System.out.println("student save successfully");
    	
    	 
    	  
     }catch(Exception e) {
    	 if(transaction!=null) {
    		 transaction.rollback();
    	 }
    	 e.printStackTrace();
     }finally {
    	 session.close();
     }
    
    }
}
