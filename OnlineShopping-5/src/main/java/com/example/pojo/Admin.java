package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {

	@Id
	@GeneratedValue
	@Column(name = "adminId")
	private int adminId;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerAdminID", fetch = FetchType.LAZY)
	private List<Retailer> adminRetailerID = new ArrayList<Retailer>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "productAdminId", fetch = FetchType.LAZY)
	private List<Product> adminProductID = new ArrayList<Product>();

	public Admin() {
		super();
	}

	// -----------------------------//

	public Admin(String name, String password, List<Retailer> adminRetailerID, List<Product> adminProductID) {
		super();

		this.name = name;
		this.password = password;
		this.adminRetailerID = adminRetailerID;
		this.adminProductID = adminProductID;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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

	public List<Retailer> getAdminRetailerID() {
		return adminRetailerID;
	}

	public void setAdminRetailerID(List<Retailer> adminRetailerID) {
		this.adminRetailerID = adminRetailerID;
	}

	public List<Product> getAdminProductID() {
		return adminProductID;
	}

	public void setAdminProductID(List<Product> adminProductID) {
		this.adminProductID = adminProductID;
	}

	// -----------------------------//

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", password=" + password + ", adminRetailerID="
				+ adminRetailerID + ", adminProductID=" + adminProductID + "]";
	}

}
