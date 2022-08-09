package com.carbuyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbuyer.model.Brand;
import com.carbuyer.model.Order;
import com.carbuyer.service.intfc.OrderService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	private Gson gson = new Gson();
	
	@GetMapping("")
	public ResponseEntity<?> getAllOrder() {
		List<Order> listOrder = orderService.getAllOrder();
		return new ResponseEntity<List<Order>>(listOrder, HttpStatus.OK);
		
	}
	
//	public List<Order> getAllOrder() {
//		return orderService.getAllOrder();
//	}
}
