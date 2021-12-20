package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Address;
import com.example.pojo.User;
import com.example.repo.AddressRepositoryImpl;
import com.example.repo.UserRepositoryImpl;


@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressRepositoryImpl addressRepo;
	
	@GetMapping("/get/{aID}")  //localhost:8080/dept/get/1
	public Address getAddress(@PathVariable("aID") int x)
	{
		Address address;
		address = addressRepo.selectAddress(x);
		return address;
	}
	
	@GetMapping("/getAll")  //localhost:8080/dept/get/1
	public List <Address> getAddresses()
	{
		List <Address> addressList;
		addressList = addressRepo.selectAddresses();
		return addressList;
	}
	
	@PutMapping("/update")
	public void updateAddress(@RequestBody int aID)
	{
		addressRepo.updateAddress(aID);
	}
	
	@PutMapping("/delete/{aID}")
	public void deleteUser(@PathVariable("aID") int x)
	{
		addressRepo.deleteAddress(x);
	}
	
}
