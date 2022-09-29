package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class FindMobileByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Mobile res = entityManager.find(Mobile.class, 1);
		System.out.println(res.getId());
		System.out.println(res.getName());
		System.out.println(res.getCost());
		List<Sim> sims = res.getSims();

		if (sims != null) {
			for (Sim s : sims) {
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getProvider());
				System.out.println("***************************************");
			}
		}

	}

}
