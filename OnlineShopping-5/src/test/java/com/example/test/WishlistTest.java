package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Product;
import com.example.pojo.User;
import com.example.pojo.Wishlist;
import com.example.repo.ProductRepositoryImpl;
import com.example.repo.UserRepositoryImpl;
import com.example.repo.WishlistRepositoryImpl;

@SpringBootTest
public class WishlistTest {

	@Autowired
	WishlistRepositoryImpl wishlistRepo;

	@Autowired
	UserRepositoryImpl userRepo;

	@Autowired
	ProductRepositoryImpl prodRepo;

	@Test
	void insertWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlistRepo.insertWishlist(wishlist);
	}

	@Test
	void insertWishlistWithUserAndProduct() {

		Wishlist wishlist = new Wishlist();

		User user = userRepo.selectUser(7);

		Product product = prodRepo.selectProduct(12);

		wishlist.setWishlistProductID(product);
		wishlist.setWishlistUserID(user);

		wishlistRepo.insertWishlist(wishlist);

	}

	@Test
	void insertWishlistWithUserTest() {
		Wishlist wishlistObj = new Wishlist();

		User userObj = userRepo.find(User.class, 66);

		wishlistObj.setWishlistUserID(userObj);

		wishlistRepo.merge(wishlistObj);
	}

	@Test
	void selectWishlistTest() {
		Wishlist wishlist;
		wishlist = wishlistRepo.selectWishlist(28);
		System.out.println("------------------------------------");

		System.out.println("Wishlist ID :" + wishlist.getWishlistId());


		System.out.println("------------------------------------");

	}

	@Test
	void deleteWishlistTest() {
		Wishlist wishlist = new Wishlist();

		wishlist.getWishlistId();

		wishlistRepo.deleteWishlist(26);
		
	}

	@Test
	void updateOrderTest() {
		Wishlist wishlist = wishlistRepo.selectWishlist(10);

		User user = userRepo.selectUser(7);
		Product product = prodRepo.selectProduct(12);

		wishlist.setWishlistProductID(product);
		wishlist.setWishlistUserID(user);

		wishlistRepo.insertWishlist(wishlist);
	}

	@Test
	void selectAllWishlistsTest() {

		List<Wishlist> wishlistList;
		wishlistList = wishlistRepo.selectWishlists();

		System.out.println("------------------------------------");
		
		for (Wishlist wishlist : wishlistList) {
			
			System.out.println("Wishlist ID :" + wishlist.getWishlistId());


			System.out.println("------------------------------------");

		}
	}
}
