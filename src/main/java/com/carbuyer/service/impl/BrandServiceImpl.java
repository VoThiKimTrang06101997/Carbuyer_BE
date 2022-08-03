package com.carbuyer.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbuyer.exception.ResourceNotFoundException;
import com.carbuyer.model.Brand;
import com.carbuyer.repository.BrandRepository;
import com.carbuyer.service.intfc.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand saveBrand(Brand brand) {
		return brandRepository.save(brand);
	}
	
	@Override
	public List<Brand> getAllBrand() {
		return brandRepository.findAll();
	}

	@Override
	public Brand getBrandById(int id) {
//		Optional<Brand> brand = brandRepository.findById(id);
//		if(brand.isPresent()) {
//			return brand.get();
//		} else {
//			throw new ResourceNotFoundException("Brand", "Id", id);
//		}
		
		return brandRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Brand", "Id", id));
	}

	@Override
	public Brand updateBrand(Brand brand, int id) {
		// Check whether Brand with given id is existed in Database or not
		Brand existingBrand = brandRepository.findById(id).orElseThrow(() -> 
			new ResourceNotFoundException("Brand", "Id", id));
		existingBrand.setName(brand.getName());
		existingBrand.setLogoPath(brand.getLogoPath());
		existingBrand.setCountryOrigin(brand.getCountryOrigin());
		
		// Save existing Brand to Database
		brandRepository.save(existingBrand);
		return existingBrand;
	}

	@Override
	public void deleteBrand(int id) {
		// Check whether Brand is existed in Database or not
		brandRepository.findById(id).orElseThrow(() -> 
			new ResourceNotFoundException("Brand", "Id", id));
		brandRepository.deleteById(id);
		
	}

}
