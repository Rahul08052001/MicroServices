package com.rating.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	@Id
	private String userId; // In real time project we generate userid like this(in userserviceimpl class) but not by autogenerated by dialect. That's why we create id as string but not long...
	private String name	;
	private String email;
	private String password;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	

}