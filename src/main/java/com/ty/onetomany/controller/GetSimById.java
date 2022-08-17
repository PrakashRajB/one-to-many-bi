package com.ty.onetomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;
import com.ty.onetomany.dto.Sim;

public class GetSimById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Sim sim = entityManager.find(Sim.class, 3);
		System.out.println("Sim id - " + sim.getId());
		System.out.println("Sim provider - " + sim.getProvider());
		System.out.println("Sim imrc - " + sim.getImrc());
		System.out.println("--------------------------------------");

		Mobile mobile = sim.getMobile();
		System.out.println("Mobile id - " + mobile.getId());
		System.out.println("Mobile Name - " + mobile.getName());
		System.out.println("Mobile Price - " + mobile.getCost());
	}

}
