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

import com.example.pojo.Cart;
import com.example.repo.CartRepositoryImpl;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartRepositoryImpl cartRepo;

	@GetMapping("/get/{cID}") // localhost:8080/cart/get/72
	public Cart getCart(@PathVariable("cID") int x) {
		Cart cart;
		cart = cartRepo.selectCart(x);
		return cart;
	}

	@PostMapping("/add")
	public void addCart(@RequestBody Cart cObj) {
		cartRepo.insertCart(cObj);
	}

	@GetMapping("/getAll") // localhost:8080/cart/getAll
	public List<Cart> getCarts() {
		List<Cart> cartList;
		cartList = cartRepo.selectCarts();
		return cartList;
	}

	@PutMapping("/update")
	public void updateCart(@RequestBody Cart cID) {
		cartRepo.updateCart(cID);
	}

	@PutMapping("/delete/{cID}")
	public void deleteCart(@PathVariable("cID") int x) {
		cartRepo.deleteCart(x);
	}
}
