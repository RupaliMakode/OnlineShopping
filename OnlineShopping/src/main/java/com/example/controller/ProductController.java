package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Product;
import com.example.repo.ProductRepositoryImpl;

@RestController
@RequestMapping("/product")

public class ProductController {

	@Autowired
	ProductRepositoryImpl productRepo;

	@GetMapping("/get/{pID}") // localhost:8080/product/get/12
	public Product getProduct(@PathVariable("pID") int x) {
		Product product;
		product = productRepo.selectProduct(x);
		return product;
	}

	@PostMapping("/add")
	public void addProduct(@RequestBody Product pObj) {
		productRepo.insertProduct(pObj);
	}

	@GetMapping("/getAll") // localhost:8080/product/getAll
	public List<Product> getProducts() {
		List<Product> productList;
		productList = productRepo.selectProducts();
		return productList;
	}

	@PutMapping("/update")
	public void updateProduct(@RequestBody Product pID) {
		productRepo.updateProduct(pID);
	}

	@PutMapping("/delete/{pID}")
	public void deleteProduct(@PathVariable("pID") int x) {
		productRepo.deleteProduct(x);
	}
}
