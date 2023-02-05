package com.demo.Library.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Library {
	
	@Id
	private Integer id;
	
	@NotBlank
	private String author;
	
	@NotBlank
	private String title;
	
	@Min(10)
	@Max(200)
	private double cost;
	
	public Library() {
		
	}
	public Library(Integer id, String author, String title, double cost) {
		this.id=id;
		this.author=author;
		this.title=title;
		this.cost=cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	

}
