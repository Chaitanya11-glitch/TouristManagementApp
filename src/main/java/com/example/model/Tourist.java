package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tourist1")
public class Tourist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotBlank(message = "Tourist name cannot be empty")
	private String name;
	private String city;
	private String packageType;
	@NotNull(message = "Package cost is required")
	@Min(value = 1, message = "Package cost must be greater than 0")
	private Long cost;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Tourist(String name, String city, String packageType, Long cost) {
		super();
		this.name = name;
		this.city = city;
		this.packageType = packageType;
		this.cost = cost;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tourist1 [id=" + id + ", name=" + name + ", city=" + city + ", packageType=" + packageType + ", cost="
				+ cost + "]";
	}
	
	

}
