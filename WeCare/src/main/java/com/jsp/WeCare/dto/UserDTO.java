package com.jsp.WeCare.dto;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usertable")
public class UserDTO {
	
	@Id
	@GenericGenerator(name = "coachIdGenerator", type = com.jsp.WeCare.utility.UserIdGenerator.class)
    @GeneratedValue(generator = "coachIdGenerator")
	private String userId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private char gender;
	private String dateOfBirth;
	@Column(nullable = false, unique = true)
	private long mobileNumber;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private int pincode;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private String country;

}