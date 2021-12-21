package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.Product;

@Repository
public class ProductRepositoryImpl extends BaseRepository implements ProductRepository {

	public ProductRepositoryImpl() {
		System.out.println("ProductRepositoryImpl ..");
	}

	@Transactional
	public void insertProduct(Product pObj) {
		super.persist(pObj);
		System.out.println("Product inserted...");
	}

	@Override
	public Product selectProduct(int pID) {
		System.out.println("ProductRepositoryImpl : selecting Product by pID");
		Product product = super.find(Product.class, pID);

		return product;
	}

	@Override
	public List<Product> selectProducts() {
		List<Product> productList = new ArrayList<Product>();

		System.out.println("OrderRepositoryImpl : Selecting all Products...");
		return super.findAll("Product");
	}

	@Transactional
	public void updateProduct(Product pID) {
		super.merge(pID);
		System.out.println("ProductRepositoryImpl : Updating Product..");

	}

	@Transactional
	public void deleteProduct(int pID) {
		super.remove(Product.class, pID);
		System.out.println("ProductRepositoryImpl : Deleting Product");

	}

}
