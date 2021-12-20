package com.example.repo;

import java.util.List;

import com.example.pojo.Product;

public interface ProductRepository {

	void insertProduct(Product pObj); // C

	Product selectProduct(int pID); // R

	List<Product> selectProducts(); // RA

	void updateProduct(Product pID); // U

	void deleteProduct(int pID); // D
}
