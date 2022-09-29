package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class InsertDriver {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setName("mi");
		m.setCost(2345);
		Sim s=new Sim();
		s.setName("airtel sim");
		s.setProvider("Airtel");
		s.setMobile(m);
		Sim s1=new Sim();
		s1.setName("bsnl sim");
		s1.setProvider("BSNL");
		s1.setMobile(m);
		List<Sim> sims=new ArrayList();
		sims.add(s);
		sims.add(s1);
		
		m.setSims(sims);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(m);
		entityManager.persist(s);
		entityManager.persist(s1);
		entityTransaction.commit();
		
		
		
	}

}
