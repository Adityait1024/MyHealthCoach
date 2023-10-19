package com.jsp.WeCare.repository;

import java.util.Optional;
import com.jsp.WeCare.dto.UserDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<UserDTO, String> {
	
	Optional<UserDTO> findByUserId(String userId);
}
