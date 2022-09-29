package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;
import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class FindHospitalByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Hospital res = entityManager.find(Hospital.class, 1);
		System.out.println(res.getId());
		System.out.println(res.getName());
		System.out.println(res.getWebsite());
		List<Branch> branches = res.getBranches();

		if (branches != null) {
			for (Branch b : branches) {
				System.out.println(b.getId());
				System.out.println(b.getCity());
				System.out.println(b.getLocation());
				System.out.println(b.getPhone());
				System.out.println("***************************************");
			}
		}

	}
}
