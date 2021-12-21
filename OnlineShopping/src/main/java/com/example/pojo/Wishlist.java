package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Wishlist")
public class Wishlist {

	@Id
	@GeneratedValue
	@Column(name = "wishlistId")
	private int wishlistId;

	@OneToOne
	@JoinColumn(name = "Userid")
	private User wishlistUserID;

	@OneToOne
	@JoinColumn(name = "Productid")
	private Product wishlistProductID;

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public User getWishlistUserID() {
		return wishlistUserID;
	}

	public void setWishlistUserID(User wishlistUserID) {
		this.wishlistUserID = wishlistUserID;
	}

	public Product getWishlistProductID() {
		return wishlistProductID;
	}

	public void setWishlistProductID(Product wishlistProductID) {
		this.wishlistProductID = wishlistProductID;
	}

	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + ", wishlistUserID=" + wishlistUserID + ", wishlistProductID="
				+ wishlistProductID + "]";
	}

	public Wishlist(int wishlistId, User wishlistUserID, Product wishlistProductID) {
		super();
		this.wishlistId = wishlistId;
		this.wishlistUserID = wishlistUserID;
		this.wishlistProductID = wishlistProductID;
	}

	public Wishlist() {
		super();
	}

	// ---------------------------------//

}