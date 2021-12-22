package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Admin;
import com.example.repo.AdminRepositoryImpl;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	AdminRepositoryImpl adminRepo;

	@GetMapping("/get/{aID}") // localhost:8080/admin/get/1
	public Admin getAdmin(@PathVariable("aID") int x) {
		Admin admin;
		admin = adminRepo.selectAdmin(x);
		return admin;
	}

	@PostMapping("/add")
	public void addAdmin(@RequestBody Admin aObj) {
		adminRepo.insertAdmin(aObj);
	}

	@GetMapping("/getAll") // localhost:8080/admin/getAll
	public List<Admin> getAdmins() {
		List<Admin> adminList;
		adminList = adminRepo.selectAdmins();
		return adminList;
	}

	@PutMapping("/update")
	public void updateAdmin(@RequestBody Admin aID) {
		adminRepo.updateAdmin(aID);
	}

	@DeleteMapping("/delete/{aID}")
	public void deleteAdmin(@PathVariable("aID") int x) {
		adminRepo.deleteAdmin(x);
	}
}
