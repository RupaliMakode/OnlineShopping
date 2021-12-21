package com.example.repo;

import java.util.List;

import com.example.pojo.Retailer;

public interface RetailerRepository {

	void insertRetailer(Retailer rObj); // C

	Retailer selectRetailer(int rID); // R

	List<Retailer> selectRetailers(); // RA

	void updateRetailer(Retailer rID); // U

	void deleteRetailer(int rID); // D
}
