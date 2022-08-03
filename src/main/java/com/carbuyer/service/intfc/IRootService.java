package com.carbuyer.service.intfc;

import org.springframework.http.ResponseEntity;

import com.carbuyer.dto.BaseResponseDto;

public interface IRootService {
	ResponseEntity<BaseResponseDto<String>> hello();
	ResponseEntity<BaseResponseDto<String>> demoFail();
}
