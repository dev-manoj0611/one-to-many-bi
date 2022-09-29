package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class InsertDriver1 {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.setName("apolo");
		h.setWebsite("www.apolo.com");

		Branch b = new Branch();
		b.setLocation("bannerghatta");
		b.setCity("banglore");
		b.setPhone(234567);
		b.setHospital(h);

		Branch b1 = new Branch();
		b1.setLocation("rajajinagar");
		b1.setCity("banglore");
		b1.setPhone(23345667);
		b1.setHospital(h);
		
		List<Branch> branches=new ArrayList();
		branches.add(b);
		branches.add(b1);
		
		h.setBranches(branches);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(h);
		em.persist(b);
		em.persist(b1);
		et.commit();

	}

}
