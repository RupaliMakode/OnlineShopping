package com.example.repo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.pojo.Retailer;

@Repository
public class RetailerRepositoryImpl extends BaseRepository implements RetailerRepository {

	public RetailerRepositoryImpl() {
		System.out.println("RetailerRepositoryImpl ..");
	}

	@Transactional
	public void insertRetailer(Retailer rObj) {
		super.persist(rObj);
		System.out.println("Retailer inserted...");
	}

	@Override
	public Retailer selectRetailer(int rID) {
		System.out.println("RetailerRepositoryImpl : selecting Retailer by rID");
		Retailer retailer = super.find(Retailer.class, rID);

		return retailer;
	}

	@Override
	public List<Retailer> selectRetailers() {
		List<Retailer> retailerList = new ArrayList<Retailer>();

		System.out.println("RetailerRepositoryImpl : Selecting all Retailers...");
		return super.findAll("Retailer");
	}

	@Transactional
	public void updateRetailer(Retailer rID) {
		super.merge(rID);
		System.out.println("RetailerRepositoryImpl : Updating Retailer..");

	}

	@Transactional
	public void deleteRetailer(int rID) {
		super.remove(Retailer.class, rID);
		System.out.println("RetailerRepositoryImpl : Deleting Retailer");

	}

}
