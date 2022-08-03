package com.carbuyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbuyer.dto.BaseResponseDto;
import com.carbuyer.service.intfc.IRootService;

@RestController
@RequestMapping("/api/v1")
public class RootController {
	@Autowired
	private IRootService rootService;
	
	@GetMapping("/hello")
	public ResponseEntity<BaseResponseDto<String>> hello() {
		return rootService.hello();
	}
	
	@GetMapping("/fail")
	public ResponseEntity<BaseResponseDto<String>> demoFail() {
		return rootService.demoFail();
	}
}
