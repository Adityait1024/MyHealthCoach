package com.jsp.WeCare.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.WeCare.dao.UserDao;
import com.jsp.WeCare.dto.ResponseStructure;
import com.jsp.WeCare.dto.UserDTO;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public ResponseEntity<ResponseStructure<UserDTO>> createUser(UserDTO user) {
		ResponseStructure<UserDTO> structure = new ResponseStructure<>();
		user = dao.createUser(user);
		structure.setMassage("User registered successfullly");
		structure.setData(user);
		return new ResponseEntity<ResponseStructure<UserDTO>>(structure, HttpStatus.CREATED);
	}

}

/*
 * public ResponseEntity<ResponseStructure<Merchant>> saveMerchant(Merchant merchant) {
		ResponseStructure<Merchant> structure = new ResponseStructure<>();
		merchant = dao.saveMerchant(merchant);
		structure.setMessage("Merchant registered successfully");
		structure.setData(merchant);
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Merchant>>(structure, HttpStatus.CREATED);
	}
 */

