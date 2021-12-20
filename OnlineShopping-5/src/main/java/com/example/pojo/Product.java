package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue
	private int productId;

	private int price;
	private String image;
	private String description;
	private String brand;
	private int stockRemaining;

	@ManyToOne
	@JoinColumn(name = "adminId")
	private Admin productAdminId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User productUserId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStockRemaining() {
		return stockRemaining;
	}

	public void setStockRemaining(int stockRemaining) {
		this.stockRemaining = stockRemaining;
	}

	public Admin getProductAdminId() {
		return productAdminId;
	}

	public void setProductAdminId(Admin productAdminId) {
		this.productAdminId = productAdminId;
	}

	public User getProductUserId() {
		return productUserId;
	}

	public void setProductUserId(User productUserId) {
		this.productUserId = productUserId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", image=" + image + ", description="
				+ description + ", brand=" + brand + ", stockRemaining=" + stockRemaining + ", productAdminId="
				+ productAdminId + ", productUserId=" + productUserId + "]";
	}

	public Product() {
		super();
	}

	public Product(int price, String image, String description, String brand, int stockRemaining, Admin productAdminId,
			User productUserId) {
		super();
		this.price = price;
		this.image = image;
		this.description = description;
		this.brand = brand;
		this.stockRemaining = stockRemaining;
		this.productAdminId = productAdminId;
		this.productUserId = productUserId;
	}

}
