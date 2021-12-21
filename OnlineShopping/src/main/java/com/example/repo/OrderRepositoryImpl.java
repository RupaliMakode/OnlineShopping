package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.Order;

@Repository
public class OrderRepositoryImpl extends BaseRepository implements OrderRepository {

	public OrderRepositoryImpl() {
		System.out.println("OrderRepositoryImpl ..");
	}

	@Transactional
	public void insertOrder(Order oObj) {
		super.persist(oObj);
		System.out.println("Order inserted...");

	}

	@Override
	public Order selectOrder(int oID) {
		System.out.println("OrderRepositoryImpl : selecting Order by oID");
		Order order = super.find(Order.class, oID);

		return order;
	}

	@Override
	public List<Order> selectOrders() {
		List<Order> orderList = new ArrayList<Order>();

		System.out.println("OrderRepositoryImpl : Selecting all Orders...");
		return super.findAll("Order");
	}

	@Transactional
	public void updateOrder(Order oID) {
		super.merge(oID);
		System.out.println("OrderRepositoryImpl : Updating Order...");

	}

	@Transactional
	public void deleteOrder(int oID) {
		super.remove(Order.class, oID);
		System.out.println("OrderRepositoryImpl : Deleting Order");
	}

}
