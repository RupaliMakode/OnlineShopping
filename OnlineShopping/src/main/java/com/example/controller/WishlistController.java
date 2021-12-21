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

import com.example.pojo.Wishlist;
import com.example.repo.WishlistRepositoryImpl;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

	@Autowired
	WishlistRepositoryImpl wishilistRepo;

	@GetMapping("/get/{wID}") // localhost:8080/wishlist/get/14
	public Wishlist getWishlist(@PathVariable("wID") int x) {
		Wishlist wishlist;
		wishlist = wishilistRepo.selectWishlist(x);
		return wishlist;
	}

	@PostMapping("/add")
	public void addWishlists(@RequestBody Wishlist aObj) {
		wishilistRepo.insertWishlist(aObj);
	}

	@GetMapping("/getAll") // localhost:8080/wishlist/getAll
	public List<Wishlist> getWishlists() {
		List<Wishlist> wishlistList;
		wishlistList = wishilistRepo.selectWishlists();
		return wishlistList;
	}

	@PutMapping("/update")
	public void updateWishlist(@RequestBody Wishlist wID) {
		wishilistRepo.updateWishlist(wID);
	}

	@PutMapping("/delete/{uID}")
	public void deleteWishlist(@PathVariable("uID") int x) {
		wishilistRepo.deleteWishlist(x);
	}
}
