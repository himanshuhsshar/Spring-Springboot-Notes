package com.jbv.beans;

import java.util.Date;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trip {
	@Positive(message = "tripNo should be an non-zero positive integer")
	private int tripNo;
	@NotBlank(message = "tripName cannot be blank")
	private String tripName;

	@NotBlank(message = "source cannot be blank")
	@Size(min = 4, max = 15, message = "source should be between 4 to 15 characters in length")
	private String source;
	
	@NotBlank(message = "destination cannot be blank")
	private String destination;
	@Future(message = "tripPlannedDate should be in future")
	private Date tripPlannedDate;
	@NotBlank(message = "transportMode cannot be blank")
	private String transportMode;
	@DecimalMin(value = "1.0", message = "amount should be a minimum of 1.0")
	@DecimalMax(value = "9999999.99", message = "amount should can be maximum of 9999999.99")
	private double amount;

}
