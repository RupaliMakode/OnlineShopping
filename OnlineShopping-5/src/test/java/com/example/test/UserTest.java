package com.example.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.User;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class UserTest {

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertUserTest() {
		User user = new User();

		user.setName("Ritika_Neova");
		user.setEmail("ritika@neova.com");
		user.setPassword("Riti123");
		user.setMobileNumber(9561140178l);
		user.setAddress("katraj, Pune");

		userRepo.insertUser(user);
	}

	@Test
	void selectUserTest() {
		User user = userRepo.selectUser(7);

		System.out.println("------------------------------------");

		System.out.println("User ID       :" + user.getUserId());
		System.out.println("User Name     :" + user.getName());
		System.out.println("User Email    :" + user.getEmail());
		System.out.println("User Password :" + user.getPassword());
		System.out.println("User Mobile   :" + user.getMobileNumber());
		System.out.println("User Address  :" + user.getAddress());
		System.out.println("------------------------------------");

	}

	@Test
	void deleteUserTest() {
		User user = new User();
		user.getUserId();
		userRepo.deleteUser(4);
	}

	@Test
	void updateUserTest() {

		User user = userRepo.selectUser(8);

		user.setEmail("Ritika@neova.com");

		userRepo.updateUser(user);
	}

	@Test
	void selectAllUsersTest() {
		List<User> userList = userRepo.selectUsers();

		System.out.println("------------------------------------");

		for (User user : userList) {
			System.out.println("User Id         :" + user.getUserId());
			System.out.println("User name       :" + user.getName());
			System.out.println("User email      :" + user.getEmail());
			System.out.println("User password   :" + user.getPassword());
			System.out.println("User mobileNum. :" + user.getMobileNumber());
			System.out.println("User Address    :" + user.getAddress());
			System.out.println("------------------------------------");

		}
	}
}
