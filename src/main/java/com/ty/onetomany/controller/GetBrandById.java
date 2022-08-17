package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Brand;
import com.ty.onetomany.dto.Product;

public class GetBrandById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Brand brand = entityManager.find(Brand.class, 1);
		System.out.println(brand);
		List<Product> products = brand.getProducts();
		for (Product p : products) {
			System.out.println(p);
		}
	}
}
