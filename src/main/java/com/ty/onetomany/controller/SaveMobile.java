package com.ty.onetomany.controller;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;
import com.ty.onetomany.dto.Sim;

public class SaveMobile {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("Oppo");
		mobile.setCost(40000);

		Sim sim1 = new Sim();
		sim1.setImrc("vi472");
		sim1.setProvider("VI");
		sim1.setMobile(mobile);

		Sim sim2 = new Sim();
		sim2.setImrc("bsnl478");
		sim2.setProvider("BSNL");
		sim2.setMobile(mobile);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();

		System.out.println("---data stored---");
	}

}
