package com.carbuyer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="brand")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="logo_path")
	private String logoPath;
	
	@Column(name="country_origin")
	private String countryOrigin;
	
//	@Column(name="parent_id")
//	private int parentId;
	
}
