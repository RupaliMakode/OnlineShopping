package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Retailer")
public class Retailer {

	@Id
	@GeneratedValue
	@Column(name = "retailerId")
	private int retailerId;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNumber")
	private long mobileNumber;

	@Column(name = "categorie")
	private String categorie;

	@Column(name = "brand")
	private String brand;

	@ManyToOne
	@JoinColumn(name = "adminId")
	private Admin retailerAdminID;

	// -----------------------------//

	public int getRetailerId() {
		return retailerId;
	}

	public Retailer(String name, String password, long mobileNumber, String categorie, String brand) {
		super();
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.categorie = categorie;
		this.brand = brand;
	}

	/**
	 * 
	 */
	public Retailer() {
		super();
	}

	/**
	 * @param retailerId
	 * @param name
	 * @param password
	 * @param mobileNumber
	 * @param categorie
	 * @param brand
	 * @param retailerAdminID
	 */
	public Retailer(String name, String password, long mobileNumber, String categorie, String brand,
			Admin retailerAdminID) {
		super();

		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.categorie = categorie;
		this.brand = brand;
		this.retailerAdminID = retailerAdminID;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Admin getRetailerAdminID() {
		return retailerAdminID;
	}

	public void setRetailerAdminID(Admin retailerAdminID) {
		this.retailerAdminID = retailerAdminID;
	}

	// -----------------------------//

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", name=" + name + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", categorie=" + categorie + ", brand=" + brand + ", retailerAdminID="
				+ retailerAdminID + "]";
	}

}
