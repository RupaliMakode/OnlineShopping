package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Cart;
import com.example.pojo.User;
import com.example.repo.CartRepositoryImpl;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class CartTest {

	@Autowired
	CartRepositoryImpl cartRepo;

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertUserTest() {
		Cart cart = new Cart();

		cart.setQuantity(10);
		cart.setTotal_Cart_Price(10000);

		cartRepo.insertCart(cart);
	}

	@Test
	void insertCartWithUserTest() {

		Cart cart = new Cart();

		cart.setQuantity(50);
		cart.setTotal_Cart_Price(28000);

		User userObj = userRepo.selectUser(4);

		cart.setCartUserID(userObj);

		cartRepo.insertCart(cart);

	}

	@Test
	void selectCartTest() {
		Cart cart;
		cart = cartRepo.selectCart(5);
		System.out.println("------------------------------------");

		System.out.println("Cart ID         :" + cart.getCartId());
		System.out.println("Cart Quantity   :" + cart.getQuantity());
		System.out.println("Cart TotalPrice :" + cart.getTotal_Cart_Price());

		
		System.out.println("------------------------------------");

	}

	@Test
	void deleteOrderTest() {
		
		Cart cart1 = new Cart();
	
		cartRepo.deleteCart(5);
	}

	@Test
	void updateCartTest() {
		Cart cartObj = cartRepo.selectCart(23);

		cartObj.setQuantity(26);
		cartObj.setTotal_Cart_Price(78200);

		cartRepo.merge(cartObj);
	}

	@Test
	void selectAllCartsTest() {
		List<Cart> cartList;
		cartList = cartRepo.selectCarts();
		System.out.println("------------------------------------");

		for (Cart cart : cartList) {
			System.out.println("Cart ID         :" + cart.getCartId());
			System.out.println("Cart Quantity   :" + cart.getQuantity());
			System.out.println("Cart TotalPrice :" + cart.getTotal_Cart_Price());

			
			System.out.println("------------------------------------");

		}
	}

}
