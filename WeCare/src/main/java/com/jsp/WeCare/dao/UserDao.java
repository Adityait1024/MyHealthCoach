package com.jsp.WeCare.dao;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.WeCare.dto.LoginDTO;
import com.jsp.WeCare.dto.UserDTO;
import com.jsp.WeCare.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repository;
	
	public UserDTO createUser(UserDTO user) {
		return repository.save(user);
	} 
	
	
//	public Optional<UserDTO> getUserProfile(String userId) {
//		return repository.findById(userId);
//	}
	
}

/*
 * 
 * public Merchant saveMerchant(Merchant merchant) {
		return repository.save(merchant);
	}

	public Merchant updateMerchant(Merchant merchant) {
		return repository.save(merchant);
	}

	public Optional<Merchant> findById(int id) {
		return repository.findById(id);
	}

	public boolean deleteById(int id) {
		Optional<Merchant> recMerchant = repository.findById(id);
		if (recMerchant.isPresent()) {
			repository.delete(recMerchant.get());
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	public Optional<Merchant> verifyMerchant(long phone, String password) {
		return repository.verifyMerchant(phone, password);
	}
 * 
 * 
*/