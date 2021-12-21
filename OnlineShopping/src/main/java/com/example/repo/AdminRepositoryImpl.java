package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.Admin;

@Repository
public class AdminRepositoryImpl extends BaseRepository implements AdminRepository {

	public AdminRepositoryImpl() {
		System.out.println("AdminRepositoryImpl ..");
	}

	@Transactional
	public void insertAdmin(Admin aObj) {
		super.persist(aObj);
		System.out.println("Admin inserted...");

	}

	@Override
	public Admin selectAdmin(int aID) {
		System.out.println("AdminRepositoryImpl : selecting Admin by aID");
		Admin admin = super.find(Admin.class, aID);

		return admin;
	}

	@Override
	public List<Admin> selectAdmins() {
		List<Admin> adminList = new ArrayList<Admin>();

		System.out.println("AdminRepositoryImpl : Selecting all Admins...");
		return super.findAll("Admin");
	}

	@Transactional
	public void updateAdmin(Admin aID) {
		super.merge(aID);
		System.out.println("AdminRepositoryImpl : Updating Admin...");

	}

	@Transactional
	public void deleteAdmin(int aID) {
		super.remove(Admin.class, aID);
		System.out.println("AdminRepositoryImpl : Deleting Admin");

	}

}
