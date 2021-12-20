package com.example.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Address;
import com.example.repo.AddressRepositoryImpl;
import com.example.repo.UserRepositoryImpl;
@SpringBootTest
public class AddressInsert {

	@Autowired
	AddressRepositoryImpl addressRepo;
	
	
	@Test 
	void insertAddressTest()
	{
		Address address = new Address();
		
		address.setAddressId(101);
		address.setAddressLine("Magarpatta");
		address.setCity("Pune");
		address.setState("Maharashtra");
		address.setPostalCode(411028);
		
		addressRepo.insertAddress(address);
	}
	
}
