package com.carbuyer.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponseDto<T> {
	private HttpStatus httpStatus;
	private String message;
	private T data;
	
	
	public static <T> ResponseEntity<BaseResponseDto<T>> success(String message, T data) {
		BaseResponseDto<T> responseDto = new BaseResponseDto<>();
		responseDto.setHttpStatus(HttpStatus.OK);
		responseDto.setMessage(message);
		responseDto.setData(data);
		return ResponseEntity.ok(responseDto);
	}
	
	public static <T> ResponseEntity<BaseResponseDto<T>> fail(HttpStatus httpStatus, String message, T data) {
		BaseResponseDto<T> responseDto = new BaseResponseDto<>();
		responseDto.setHttpStatus(httpStatus);
		responseDto.setMessage(message);
		responseDto.setData(data);
		return ResponseEntity.ok(responseDto);
	}
}
