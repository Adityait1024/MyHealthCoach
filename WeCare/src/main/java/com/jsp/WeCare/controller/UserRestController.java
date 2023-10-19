package com.jsp.WeCare.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WeCare.dto.ResponseStructure;
import com.jsp.WeCare.dto.UserDTO;
import com.jsp.WeCare.service.UserService;


@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/register-user")
	public ResponseEntity<ResponseStructure<UserDTO>> createUser(@RequestBody UserDTO user) {
		return service.createUser(user);
	}
	
	
//	@PostMapping("/merchants")
//	public ResponseEntity<ResponseStructure<Merchant>> saveMerchant(@RequestBody Merchant merchant) {
//		ResponseStructure<Merchant> structure = new ResponseStructure<>();
//		return service.saveMerchant(merchant);
//	}


}
