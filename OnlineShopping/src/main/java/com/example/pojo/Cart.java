package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

	@Id
	@GeneratedValue
	@Column(name = "cartId")
	private int cartId;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "total_Cart_Price")
	private int total_Cart_Price;

	@OneToOne
	@JoinColumn(name = "cartUserID")
	private User cartUserID;

	// ---------------------------------//

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal_Cart_Price() {
		return total_Cart_Price;
	}

	public void setTotal_Cart_Price(int total_Cart_Price) {
		this.total_Cart_Price = total_Cart_Price;
	}

	public User getCartUserID() {
		return cartUserID;
	}

	public void setCartUserID(User cartUserID) {
		this.cartUserID = cartUserID;
	}

	public Cart() {
		super();
	}

	public Cart(int cartId, int quantity, int total_Cart_Price, User cartUserID) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.total_Cart_Price = total_Cart_Price;
		this.cartUserID = cartUserID;
	}

	// ---------------------------------//

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", quantity=" + quantity + ", total_Cart_Price=" + total_Cart_Price
				+ ", cartUserID=" + cartUserID + "]";
	}

}
