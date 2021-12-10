package com.tushar.BusinessObjects;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {

	private String ename;
	private String eadd;
	private double baseSal;
	private Long phone;
	
}
