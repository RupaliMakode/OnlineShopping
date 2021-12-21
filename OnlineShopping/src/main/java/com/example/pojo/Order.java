package com.example.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ordertable")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "orderId")
	private int orderId;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "date")
	private LocalDate localDate;

	@Column(name = "total_Order_Price")
	private int total_Order_Price;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User orderUserID;

	// ---------------------------------//

	public Order() {
		super();
	}

	public Order(int quantity, LocalDate localDate, int total_Order_Price, User orderUserID) {
		super();

		this.quantity = quantity;
		this.localDate = localDate;
		this.total_Order_Price = total_Order_Price;
		this.orderUserID = orderUserID;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public int getTotal_Order_Price() {
		return total_Order_Price;
	}

	public void setTotal_Order_Price(int total_Order_Price) {
		this.total_Order_Price = total_Order_Price;
	}

	public User getOrderUserID() {
		return orderUserID;
	}

	public void setOrderUserID(User orderUserID) {
		this.orderUserID = orderUserID;
	}

	// ---------------------------------//

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", localDate=" + localDate
				+ ", total_Order_Price=" + total_Order_Price + ", orderUserID=" + orderUserID + "]";
	}

}
