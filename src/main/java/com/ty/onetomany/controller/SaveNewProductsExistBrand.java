package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Brand;
import com.ty.onetomany.dto.Product;

public class SaveNewProductsExistBrand {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Brand brand = entityManager.find(Brand.class, 2);

//		List<Product> products = brand.getProducts();---->without this Old and New Products getting stored.
		Product product1 = new Product();
		product1.setName("Mi 12x pro");
		product1.setCost(68000);
		product1.setBrand(brand);
//		products.add(product1);

		Product product2 = new Product();
		product2.setName("Xiamoi note");
		product2.setCost(28000);
		product2.setBrand(brand);
//		products.add(product2);

		entityTransaction.begin();
		entityManager.persist(brand);
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityTransaction.commit();
	}

}
