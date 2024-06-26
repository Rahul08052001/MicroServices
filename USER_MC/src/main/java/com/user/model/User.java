package com.user.model;

import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames = "userId")})
@JsonIgnoreProperties({"password"})
public class User {
	
	@Id
	private String userId; // In real time project we generate userid like this(in userserviceimpl class) but not by autogenerated by dialect. That's why we create id as string but not long...
	private String name	;
	private String email;
//	@JsonIgnore
	private String password;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	

}
