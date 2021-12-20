package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.pojo.Cart;

@Repository
public class CartRepositoryImpl extends BaseRepository implements CartRepository {

	public CartRepositoryImpl() {
		System.out.println("CartRepositoryImpl ..");
	}

	@Transactional
	public void insertCart(Cart cObj) {
		super.persist(cObj);
		System.out.println("Cart inserted...");
	}

	@Override
	public Cart selectCart(int cID) {
		System.out.println("CartRepositoryImpl : selecting Cart by cID");
		Cart cart = super.find(Cart.class, cID);

		return cart;
	}

	@Override
	public List<Cart> selectCarts() {
		List<Cart> cartList = new ArrayList<Cart>();

		System.out.println("CartRepositoryImpl : Selecting all Carts...");
		return super.findAll("Cart");
	}

	@Transactional
	public void updateCart(Cart cID) {
		super.merge(cID);
		System.out.println("CartRepositoryImpl : Updating Cart...");

	}

	@Transactional
	public void deleteCart(int cID) {
		super.remove(Cart.class, cID);
		System.out.println("CartRepositoryImpl : Deleting Cart");

	}

}
