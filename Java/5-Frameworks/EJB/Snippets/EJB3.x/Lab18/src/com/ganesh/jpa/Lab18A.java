package com.ganesh.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Lab18A {
	public static void main(String[] args) {
	
	EntityTransaction tx = null;
	try{
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JLCINDIA-PU");
		EntityManager manager = factory.createEntityManager();
		tx= manager.getTransaction();
		tx.begin();
		Customer cust = new Customer("ganesh", "gb", "ganesh@gg.com", 192833);
		manager.persist(cust);
		Address add = new Address("Bangalore", "bang", "india", "111");
		manager.persist(add);
		cust.setAddress(add);
		tx.commit();
	}catch(Exception e){
		e.printStackTrace();
		tx.rollback();
	}
 }
}
