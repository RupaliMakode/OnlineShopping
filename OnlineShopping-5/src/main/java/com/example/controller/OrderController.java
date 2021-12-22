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

import com.example.pojo.Order;
import com.example.repo.OrderRepositoryImpl;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderRepositoryImpl orderRepo;

	@GetMapping("/get/{oID}") // localhost:8080/order/get/17
	public Order getAdmin(@PathVariable("oID") int x) {
		Order order;
		order = orderRepo.selectOrder(x);
		return order;
	}

	@PostMapping("/add")
	public void addOrder(@RequestBody Order oObj) {
		orderRepo.insertOrder(oObj);
	}

	@GetMapping("/getAll") // localhost:8080/order/getAll
	public List<Order> getOrders() {
		List<Order> orderList;
		orderList = orderRepo.selectOrders();
		return orderList;
	}

	@PutMapping("/update")
	public void updateOrder(@RequestBody Order oID) {
		orderRepo.updateOrder(oID);
	}

	@DeleteMapping("/delete/{oID}")
	public void deleteOrder(@PathVariable("oID") int x) {
		orderRepo.deleteOrder(x);
	}
}
