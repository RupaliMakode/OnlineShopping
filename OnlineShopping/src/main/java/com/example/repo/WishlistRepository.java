package com.example.repo;

import java.util.List;
import com.example.pojo.Wishlist;

public interface WishlistRepository {

	void insertWishlist(Wishlist uObj); // C

	Wishlist selectWishlist(int uID); // R

	List<Wishlist> selectWishlists(); // RA

	void updateWishlist(Wishlist uID); // U

	void deleteWishlist(int uID); // D
}
