package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Tourist;
import com.example.service.TouristService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@Tag(name = "Tourist Management", description = "APIs for managing tourist data")
public class TouristController {
	
	private TouristService touristService;

	@Autowired
	public void setTouristService(TouristService touristService) {
		this.touristService = touristService;
	}
	
	@Operation(summary = "Register a new tourist")
	@PostMapping("/register-tourist")
	public ResponseEntity<String> registerTourist(@Valid @RequestBody Tourist tourist1){
		
		String data = touristService.registerTourist(tourist1);
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@Operation(summary = "Fetch tourist by ID")
	@GetMapping("/tourist-id/{id}")
	public ResponseEntity<Tourist> fetchTouristById(@PathVariable("id") Integer id){
		
		Tourist data = touristService.fetchTourist1ById(id);
		return new ResponseEntity<Tourist>(data,HttpStatus.OK);
	}
	@Operation(summary = "Fetch all tourists")
	@GetMapping("/tourists")
	public ResponseEntity<List<Tourist>> fetchAllTousrists(){
		List<Tourist> data = touristService.fetchAllTouristInfo();
		return new ResponseEntity<List<Tourist>>(data,HttpStatus.OK);
	}
	@Operation(summary = "Update tourist info")
	@PutMapping("/update")
	public ResponseEntity<String> updateTourististInfo(@Valid @RequestBody Tourist tourist1){
		
		String data = touristService.updateTourist1Info(tourist1);
		return new ResponseEntity<String>(data, HttpStatus.OK);
	}
	@Operation(summary = "Update tourist budget by ID")
	@PatchMapping("/update-ById/{id}/{cost}")
	public ResponseEntity<String> updateToursitById(@PathVariable("id") Integer id,@PathVariable("cost") Long cost){
		
		String data = touristService.updateTouristBudget(id, cost);
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@Operation(summary = "Delete tourist by ID")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTouristInfo(@PathVariable("id") Integer id){
		
		String data = touristService.deleteTourist1ById(id);
		return new ResponseEntity<String>(data,HttpStatus.OK);
		
	}
	
	

}
