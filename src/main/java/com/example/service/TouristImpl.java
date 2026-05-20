package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.TouristNotFoundException;
import com.example.model.Tourist;
import com.example.repo.TouristRepo;

@Service
public class TouristImpl implements TouristService {

	
	private TouristRepo touristRepo;
	
	@Autowired
	public void setTouristRepo(TouristRepo touristRepo) {
		this.touristRepo = touristRepo;
	}

	@Override
	public String registerTourist(Tourist tourist1) {
		
		Tourist data = touristRepo.save(tourist1);
		
		return data + "Tourist info has been registered successfully";
	}

	@Override
	public Tourist fetchTourist1ById(Integer id) {
		
		Optional<Tourist> data = touristRepo.findById(id);
		
		if (data.isPresent()) {
			
			return data.get();
			
		}
		throw new TouristNotFoundException("Tourist with that Id is not present");
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		
		List<Tourist> data = touristRepo.findAll();
		return data;
	}

	@Override
	public String updateTourist1Info(Tourist tourist1) {
		Optional<Tourist> data = touristRepo.findById(tourist1.getId());
		if (data.isPresent()) {
			
			touristRepo.save(tourist1);
			return "Data Updated Succesffuly";
			
		}
		throw new TouristNotFoundException("Tourist with that Id is not available");
	}

	@Override
	public String updateTouristBudget(Integer id, Long cost) {
		
		Optional<Tourist> data = touristRepo.findById(id);
		if (data.isPresent()) {
			
			Tourist tourist = data.get();
			tourist.setCost(cost);
			touristRepo.save(tourist);
			return "Toursit Data Updated Successfully";
		}
		
		throw new TouristNotFoundException("Tourist with Id is not available");
	}

	@Override
	public String deleteTourist1ById(Integer id) {
		
		Optional<Tourist> data = touristRepo.findById(id);
		if (data.isPresent()) {
			touristRepo.deleteById(id);
			
			return "Tourist with the given Id is deleted";
		}
		throw new TouristNotFoundException("Toursit with that id is not present");
	}
	
	

}
