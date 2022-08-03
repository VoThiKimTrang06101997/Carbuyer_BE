package com.carbuyer.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carbuyer.dto.BaseResponseDto;
import com.carbuyer.service.intfc.IRootService;

@Service
public class RootServiceImpl implements IRootService {
	@Override
	public ResponseEntity<BaseResponseDto<String>> hello() {
		return BaseResponseDto.success("success", "Hello World !");
	}
	
	@Override
	public ResponseEntity<BaseResponseDto<String>> demoFail() {
		return BaseResponseDto.fail(HttpStatus.INTERNAL_SERVER_ERROR, "failed", null);
	}
}
