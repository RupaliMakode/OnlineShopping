package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.Address;
import com.example.pojo.User;
@Repository
public class AddressRepositoryImpl extends BaseRepository implements AddressRepository {

	public AddressRepositoryImpl() {
		System.out.println("AddressRepositoryImpl ..");	
    }
	
	@Transactional
	public void insertAddress(Address aObj) {
		System.out.println("Address inserted...");

	}

	@Override
	public Address selectAddress(int aID) {
		System.out.println("AddressRepositoryImpl : selecting Address by aID");
		Address address = super.find(Address.class, aID);

		return address;
	}

	@Override
	public List<Address> selectAddresses() {
		List<Address>  addressList = new ArrayList<Address>();

		System.out.println("AddressRepositoryImpl : Selecting all Addresses...");
		return super.findAll("Address");
	}

	@Transactional
	public void updateAddress(int aID) {
		System.out.println("AddressRepositoryImpl : Updating Address...");
		super.merge(aID);

	}

	@Transactional
	public void deleteAddress(int aID) {
		System.out.println("AddressRepositoryImpl : Deleting Address");
		super.remove(Address.class, aID);
	}

}
