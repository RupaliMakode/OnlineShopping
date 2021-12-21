/*
package com.example.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Address;
import com.example.pojo.User;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class UserInsert {

	
	@Autowired
	UserRepositoryImpl userRepo;
	
	@Test 
	void insertUserTest()
	{
		User user = new User();
		
		user.setName("Ritika_Neova");
		user.setEmail("Ritika@neova.com");
		user.setPassword("Ritika123");
		user.setMobileNumber(9405405443l);
				
		userRepo.insertUser(user);
	}
	
	@Test 
	void selectUserTest()
	{
		User user ;
		user = userRepo.selectUser(47);
		System.out.println("------------------------------------");

		System.out.println("User ID       :"+user.getUserId());
		System.out.println("User Name     :"+user.getName());
		System.out.println("User Email    :"+user.getEmail());
		System.out.println("User Password :"+user.getPassword());
		System.out.println("User Mobile   :"+user.getMobileNumber());
		System.out.println("------------------------------------");

		
	}
	
	@Test
	void deleteUserTest()
	{
		User user = new User();
		user.getUserId();
		userRepo.deleteUser(48);
	}
	
	@Test 
	void updateUserTest()
	{
		User user = new User();
	
		user.setUserId(49);
		user.setName("Ritika");
		user.setEmail("rupali@neova.com");
		user.setPassword("rupali12345");
		user.setMobileNumber(9156140178l);
				
		userRepo.updateUser(user);
	}
	
	@Test 
	void selectAllUsersTest()
	{
		List <User> userList;
		userList = userRepo.selectUsers();
		System.out.println("------------------------------------");

		for(User user : userList)
		{
			System.out.println("User Id         :"+user.getUserId());
			System.out.println("User name       :"+user.getName());
			System.out.println("User email      :"+user.getEmail());
			System.out.println("User password   :"+user.getPassword());
			System.out.println("User mobileNum. :"+user.getMobileNumber());
			System.out.println("------------------------------------");

		}
	}
	
}
*/
