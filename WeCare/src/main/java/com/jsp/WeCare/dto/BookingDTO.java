package com.jsp.WeCare.dto;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookingDTO {
	
	private int bookingId;
	private String userId;
	private String coachId;
	private String slot;
	private LocalDate appointmentDate;
}

