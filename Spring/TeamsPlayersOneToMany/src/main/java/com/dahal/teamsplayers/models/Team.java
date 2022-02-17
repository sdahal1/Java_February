package com.dahal.teamsplayers.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "teams")
public class Team {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
    @NotBlank(message = "Team name is required!")
    @Size(min = 3, max = 200, message= "Team name must be between 3-200 characters")
    private String name;
    
	  //ONE TO MANY CODE BELOW!!
	  //a team can have many players, so we can store players in a list
	  @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
	  private List<Player> players;

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
	  public Team() {}
	  
	  //loaded constructor
	  public Team(String name) {
			
		this.name = name;
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
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
    



}
