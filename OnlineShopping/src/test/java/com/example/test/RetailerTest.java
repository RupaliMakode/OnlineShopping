package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Admin;
import com.example.pojo.Retailer;

import com.example.repo.AdminRepositoryImpl;
import com.example.repo.RetailerRepositoryImpl;

@SpringBootTest
public class RetailerTest {

	@Autowired
	RetailerRepositoryImpl retailerRepo;

	@Autowired
	AdminRepositoryImpl adminRepo;

	@Test
	void insertRetailerTest() {
		Retailer retailer = new Retailer();

		retailer.setName("R-Rupali");
		retailer.setPassword("rupali@123");
		retailer.setMobileNumber(9405405443l);
		retailer.setCategorie("Mobile");
		retailer.setBrand("M.I.");

		retailerRepo.insertRetailer(retailer);
	}

	@Test
	void insertRetailerWithAdminTest() {

		Admin admin1 = adminRepo.selectAdmin(1);

		Retailer ret1 = new Retailer("R-Ajay", "rahul123", 9405405522l, "Mobile", "Sony", admin1);

		retailerRepo.merge(ret1);
	}

	@Test
	void selectRetailerTest() {
		Retailer retailer;
		retailer = retailerRepo.selectRetailer(5);
		System.out.println("------------------------------------");

		System.out.println("Retailer ID           :" + retailer.getRetailerId());
		System.out.println("Retailer Name         :" + retailer.getName());
		System.out.println("Retailer Password     :" + retailer.getPassword());
		System.out.println("Retailer MobileNumber :" + retailer.getMobileNumber());
		System.out.println("Retailer Categories   :" + retailer.getCategorie());
		System.out.println("Retailer Brand        :" + retailer.getBrand());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteRetailerTest() {
		Retailer retailer = new Retailer();

		retailer.getRetailerId();

		retailerRepo.deleteRetailer(6);
	}

	@Test
	void updateRetailerTest() {
		Retailer retailer = retailerRepo.selectRetailer(5);

		retailer.setPassword("ajay@123");

		retailerRepo.updateRetailer(retailer);
	}

	@Test
	void selectAllAdminsTest() {
		List<Retailer> retailerList;
		retailerList = retailerRepo.selectRetailers();
		System.out.println("------------------------------------");

		for (Retailer retailer : retailerList) {
			System.out.println("Retailer ID           :" + retailer.getRetailerId());
			System.out.println("Retailer Name         :" + retailer.getName());
			System.out.println("Retailer Password     :" + retailer.getPassword());
			System.out.println("Retailer MobileNumber :" + retailer.getMobileNumber());
			System.out.println("Retailer Categories   :" + retailer.getCategorie());
			System.out.println("Retailer Brand        :" + retailer.getBrand());

			System.out.println("------------------------------------");

		}
	}
}
