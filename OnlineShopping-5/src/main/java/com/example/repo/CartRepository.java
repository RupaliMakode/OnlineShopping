package com.example.repo;

import java.util.List;

import com.example.pojo.Cart;

public interface CartRepository {

	void insertCart(Cart cObj); // C

	Cart selectCart(int cID); // R

	List<Cart> selectCarts(); // RA

	void updateCart(Cart cID); // U

	void deleteCart(int cID); // D
}
