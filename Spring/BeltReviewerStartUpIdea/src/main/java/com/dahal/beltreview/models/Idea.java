package com.dahal.beltreview.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ideas")
public class Idea {
	
	//primary key for id thats auto generated
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	//name of idea
	@NotEmpty(message="Name of idea is required!")
    @Size(min=3, max=100, message="Idea name must be between 3 and 100 characters")
    private String name;
	
	//funding
	@NotEmpty(message="Funding is required!")
    @Min(value = 1, message= "Funding amount must be a minimum of $1")
    private double fundingAmount;
	
	
	//category for the idea (example: heathcare, finance, tech etc;)
	@NotEmpty(message="Category is required!")
    @Size(min=3, max=100, message="Category must be between 3 and 100 characters")
    private String category;
	
	//description
	@NotEmpty(message="Description is required!")
    @Size(min=10, message="Description must be at least 10 characters long")
    private String description;
	

	//user who uploaded the idea
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="uploader_id")
	private User uploader;
	
	//created at and updated at time stamps
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
    
    
    //empty constructor
    public Idea() {}
    
    
    
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
	public double getFundingAmount() {
		return fundingAmount;
	}
	public void setFundingAmount(double fundingAmount) {
		this.fundingAmount = fundingAmount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUploader() {
		return uploader;
	}
	public void setUploader(User uploader) {
		this.uploader = uploader;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
    
    


}
