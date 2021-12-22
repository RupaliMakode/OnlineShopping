package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.repo.UserRepositoryImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepositoryImpl userRepo;

	@GetMapping("/get/{uID}") // localhost:8080/user/get/7
	public User getUser(@PathVariable("uID") int x) {
		User user;
		user = userRepo.selectUser(x);
		return user;
	}

	@PostMapping("/add")
	public void addUser(@RequestBody User aObj) {
		userRepo.insertUser(aObj);
	}

	@GetMapping("/getAll") // localhost:8080/user/getAll
	public List<User> getUsers() {
		List<User> userList;
		userList = userRepo.selectUsers();
		return userList;
	}

	@PutMapping("/update")
	public void updateUser(@RequestBody User uID) {
		userRepo.updateUser(uID);
	}

	@DeleteMapping("/delete/{uID}")
	public void deleteUser(@PathVariable("uID") int x) {
		userRepo.deleteUser(x);
	}
}
