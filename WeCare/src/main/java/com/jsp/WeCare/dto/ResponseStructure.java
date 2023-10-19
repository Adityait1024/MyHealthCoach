package com.jsp.WeCare.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	private String massage;
	private T data;
	

}
