package com.carbuyer.service.intfc;

import java.util.List;

import com.carbuyer.model.Brand;

public interface BrandService {
	Brand saveBrand(Brand brand);
	List<Brand> getAllBrand();
	Brand getBrandById(int id);
	Brand updateBrand(Brand brand, int id);
	void deleteBrand(int id);
}
