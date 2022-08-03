package com.carbuyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbuyer.model.Brand;
import com.carbuyer.service.intfc.BrandService;

@RestController
@RequestMapping("/api/brand")
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	// Build add brand REST API
	@PostMapping("/add")
	public ResponseEntity<Brand> saveBrand(@RequestBody Brand brand) {
		return new ResponseEntity<Brand>(brandService.saveBrand(brand), HttpStatus.CREATED);
	}
	
	// Build get all brand REST API
	@GetMapping
	public List<Brand> getAllBrand() {
		return brandService.getAllBrand();
	}
	
	// Build get brand by id REST API
	// http://localhost:8080/api/brand/1
	@GetMapping("{id}")
	public ResponseEntity<Brand> getBrandById(@PathVariable("id") int brandId) {
		return new ResponseEntity<Brand>(brandService.getBrandById(brandId), HttpStatus.OK);
	}
	
	// Build Update brand REST API
	// http://localhost:8080/api/brand/1
	@PutMapping("{id}")
	public ResponseEntity<Brand> updateBrand(@PathVariable("id") int brandId, 
			@RequestBody Brand brand) {
		return new ResponseEntity<Brand>(brandService.updateBrand(brand, brandId), HttpStatus.OK);
		
	}
	
	// Build Delete brand REST API
	// http://localhost:8080/api/brand/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBrand(@PathVariable("id") int brandId) {
		// delete brand from Database
		brandService.deleteBrand(brandId);
		return new ResponseEntity<String>("Brand was deleted successfully !", HttpStatus.OK);
	}
}
