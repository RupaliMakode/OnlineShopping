package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Retailer;
import com.example.repo.RetailerRepositoryImpl;

@RestController
@RequestMapping("/retailer")
public class RetailerConntroller {

	@Autowired
	RetailerRepositoryImpl retailerRepo;

	@GetMapping("/get/{rID}") // localhost:8080/retailer/get/6
	public Retailer getRetailer(@PathVariable("rID") int x) {
		Retailer retailer;
		retailer = retailerRepo.selectRetailer(x);
		return retailer;
	}

	@PostMapping("/add")
	public void addRetailer(@RequestBody Retailer rObj) {
		retailerRepo.insertRetailer(rObj);
	}

	@GetMapping("/getAll") // localhost:8080/retailer/getAll
	public List<Retailer> getRetailers() {
		List<Retailer> retailerList;
		retailerList = retailerRepo.selectRetailers();
		return retailerList;
	}

	@PutMapping("/update")
	public void updateRetailer(@RequestBody Retailer rID) {
		retailerRepo.updateRetailer(rID);
	}

	@PutMapping("/delete/{rID}")
	public void deleteRetailer(@PathVariable("rID") int x) {
		retailerRepo.deleteRetailer(x);
	}
}
