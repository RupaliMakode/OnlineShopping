package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Admin;
import com.example.repo.AdminRepositoryImpl;

@SpringBootTest
public class AdminTest {

	@Autowired
	AdminRepositoryImpl adminRepo;

	@Test
	void insertAdminTest() {
		Admin admin = new Admin();

		admin.setName("Rishii");
		admin.setPassword("rishii@123");

		adminRepo.insertAdmin(admin);
	}

	@Test
	void selectAdminTest() {
		Admin admin = adminRepo.selectAdmin(1);;
		
		System.out.println("------------------------------------");

		System.out.println("Admin ID        :" + admin.getAdminId());
		System.out.println("Admin Name      :" + admin.getName());
		System.out.println("Admin Password  :" + admin.getPassword());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteAdminTest() {
		Admin admin = new Admin();

		admin.getAdminId();

		adminRepo.deleteAdmin(3);
	}

	@Test
	void updateAdminTest() {
		Admin admin = new Admin();

		admin.setAdminId(2);
		admin.setName("Rupali");
		admin.setPassword("rupali123");

		adminRepo.updateAdmin(admin);
	}

	@Test
	void selectAllAdminsTest() {
		List<Admin> adminList = adminRepo.selectAdmins();;
		
		System.out.println("------------------------------------");

		for (Admin admin : adminList) {
			System.out.println("Admin ID        :" + admin.getAdminId());
			System.out.println("Admin Name      :" + admin.getName());
			System.out.println("Admin Password  :" + admin.getPassword());
			System.out.println("------------------------------------");

		}
	}
}
