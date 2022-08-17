package com.ty.onetomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Brand;
import com.ty.onetomany.dto.Product;

public class SaveBrand {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Brand brand = new Brand();
		brand.setName("Redmi");
		brand.setDescription("Mobile Phones");

		Product product1 = new Product();
		product1.setName("Redmi note 10");
		product1.setCost(23000);
		product1.setBrand(brand);

		Product product2 = new Product();
		product2.setName("Redmi 11x");
		product2.setCost(35000);
		product2.setBrand(brand);

		Product product3 = new Product();
		product3.setName("Mi 11i");
		product3.setCost(460000);
		product3.setBrand(brand);

		entityTransaction.begin();
		entityManager.persist(brand);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityManager.persist(product3);
		entityTransaction.commit();
	}
}
