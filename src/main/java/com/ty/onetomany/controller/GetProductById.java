package com.ty.onetomany.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Brand;
import com.ty.onetomany.dto.Product;

public class GetProductById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Product product=entityManager.find(Product.class, 4);
		
		Brand brand=product.getBrand();
		
		System.out.println(brand);
		System.out.println(product);
	}

}
