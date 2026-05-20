package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Tourist;

@Repository
public interface TouristRepo extends JpaRepository<Tourist, Integer> {

}
