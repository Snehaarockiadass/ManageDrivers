package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "DriverInfo")
public class DriverInfo {

	@Id
	long driverId;
	String driverName;
	String password;
	Long driverNumber;
	String licenseNumber;
	LocalDate licenseExpiryDate;
	String createdBy;
	LocalDateTime createdDate;
	String modifiedBy;
	LocalDateTime modifiedDate;
	int isDeleted;
	
	public DriverInfo(String driverName, String password, Long driverNumber, String licenseNumber,
			LocalDate licenseExpiryDate, String createdBy, LocalDateTime createdDate, String modifiedBy,
			LocalDateTime modifiedDate, int isDeleted) {
		super();
		this.driverName = driverName;
		this.password = password;
		this.driverNumber = driverNumber;
		this.licenseNumber = licenseNumber;
		this.licenseExpiryDate = licenseExpiryDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.isDeleted = isDeleted;
	}
	
	

}
