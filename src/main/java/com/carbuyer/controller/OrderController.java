package com.carbuyer.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbuyer.model.Order;
import com.carbuyer.service.intfc.OrderService;

import com.google.gson.Gson;

@RestController
@RequestMapping("/order")
public class OrderController  {
	@Autowired
	OrderService orderService;
	
	@GetMapping("")
	public ResponseEntity<?> getAllOrder() {
		List<Order> listOrder = orderService.getAllOrder();
		return new ResponseEntity<List<Order>>(listOrder, HttpStatus.OK);
		
	}
	
	@GetMapping("/{user_id}")
	public ResponseEntity<?> getOrderByUser(@PathVariable("user_id") int user_id) {
		List<Map<String, ?>> listOrder = orderService.getOrderByUser(user_id);
		return new ResponseEntity<List<Map<String, ?>>>(listOrder, HttpStatus.OK);	
	}
	
}
