package com.example.repo;

import java.util.List;

import com.example.pojo.Admin;
import com.example.pojo.Retailer;

public interface AdminRepository {

	void insertAdmin(Admin aObj); // C

	Admin selectAdmin(int aID); // R

	List<Admin> selectAdmins(); // RA

	void updateAdmin(Admin aID); // U

	void deleteAdmin(int aID); // D
	
	//--------------Retailer--------------------//
	

}
