package com.example.repo;

import java.util.List;

import com.example.pojo.Address;
import com.example.pojo.User;

public interface AddressRepository {

	void insertAddress(Address aObj); //C

	Address selectAddress(int aID); //R
	List<Address> selectAddresses(); //RA

	void updateAddress(int aID); //U
	void deleteAddress(int aID); //D
}
