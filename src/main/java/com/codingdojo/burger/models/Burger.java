package com.codingdojo.burger.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotNull(message="name should not be blank")
    @Size(min = 5, max = 200, message="name should be at least 5")
    private String name;
    
    @NotNull(message="restaurant name should not be blank")
    @Size(min = 5, max = 200, message="restaurant name should be at least 5")
    private String restaurant;
  
    @NotNull(message="rating should not be blank")
    @Min(value=0, message="rating should be at least 0")
    @Max(value=5, message="rating should be at most 5")
    private Integer rating;
    
    @NotNull(message="note should not be blank")
    @Size(min = 5, max = 200, message="note should be at least 5")
    private String note;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public Burger() {
    }
    
    public Burger(String name, String restaurant, int rating,  String note) {
        this.name = name;
        this.restaurant = restaurant;
        this.rating = rating;
        this.note = note;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
