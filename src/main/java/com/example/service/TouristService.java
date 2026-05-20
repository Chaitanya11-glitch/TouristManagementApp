package com.example.service;

import java.util.List;

import com.example.model.Tourist;

public interface TouristService {
	
	String registerTourist(Tourist tourist1);
	Tourist fetchTourist1ById(Integer id);
	List<Tourist> fetchAllTouristInfo();
	
	//Post 
	String updateTourist1Info(Tourist tourist1);
	//PUT and Patch both are similar will see
	String updateTouristBudget(Integer id,Long cost);
	//Delete
	String deleteTourist1ById(Integer id);
	

}
