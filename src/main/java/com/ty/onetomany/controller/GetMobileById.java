package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Mobile;
import com.ty.onetomany.dto.Sim;

public class GetMobileById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile id - " + mobile.getId());
		System.out.println("Mobile Name - " + mobile.getName());
		System.out.println("Mobile Price - " + mobile.getCost());
		System.out.println("---------------------------------");

		List<Sim> sims = mobile.getSims();
		for (Sim s : sims) {
			System.out.println("Sim id- " + s.getId());
			System.out.println("Sim imrc - " + s.getImrc());
			System.out.println("Sim provider - " + s.getProvider());
			System.out.println("-----------------------------------");
		}
	}

}
