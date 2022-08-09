package com.carbuyer.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity(name="orders")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", insertable = false, updatable = false)
	// @JsonBackReference
	private User user;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="total")
	private int total;
	
	@Column(name="status")
	private String status;
	
	public Order() {
		
	}
	
	public Order(int id, User user, int userId, String date, int total, String status) {
		super();
		this.id = id;
		this.user = user;
		this.userId = userId;
		this.date = date;
		this.total = total;
		this.status = status;
	}
	
	
}
