package com.example.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Order;
import com.example.pojo.User;

import com.example.repo.OrderRepositoryImpl;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class OrderTest {

	@Autowired
	OrderRepositoryImpl orderRepo;

	@Autowired
	UserRepositoryImpl userRepo;

	@Test
	void insertOrderTest() {
		Order order = new Order();

		order.setLocalDate(LocalDate.of(1997, 06, 02));
		order.setQuantity(20);
		order.setTotal_Order_Price(18000);

		orderRepo.insertOrder(order);
	}

	@Test
	void insertOrderWithUserTest() {

		User userObj = userRepo.selectUser(7);

		Order order1 = new Order();

		order1.setLocalDate(LocalDate.of(1997, 06, 02));
		order1.setQuantity(75);
		order1.setTotal_Order_Price(550000);
		order1.setOrderUserID(userObj);

		orderRepo.insertOrder(order1);

	}

	@Test
	void deleteOrder() {

		Order order = new Order();

		orderRepo.deleteOrder(16);

	}

	@Test
	void updateOrder() {

		Order order = orderRepo.selectOrder(18);

		order.setQuantity(20);
		order.setTotal_Order_Price(22500);

		orderRepo.merge(order);

	}

	@Test
	void selectOrder() {

		Order order = orderRepo.selectOrder(19);

		System.out.println("------------------------------------");

		System.out.println("Order Id          :" + order.getOrderId());
		System.out.println("Order Date        :" + order.getLocalDate());
		System.out.println("Order Quantity    :" + order.getQuantity());
		System.out.println("Order Total_Price :" + order.getTotal_Order_Price());
//		System.out.println("Order UserId      :" + order.getOrderUserID());

		System.out.println("------------------------------------");
	}

	@Test
	void selectAllOrder() {
		List<Order> orderList;
		orderList = orderRepo.selectOrders();
		System.out.println("------------------------------------");

		for (Order order : orderList) {
			System.out.println("Order Id          :" + order.getOrderId());
			System.out.println("Order Date        :" + order.getLocalDate());
			System.out.println("Order Quantity    :" + order.getQuantity());
			System.out.println("Order Total_Price :" + order.getTotal_Order_Price());
//			System.out.println("Order UserId      :" + order.getOrderUserID());

			System.out.println("------------------------------------");

		}
	}
}
