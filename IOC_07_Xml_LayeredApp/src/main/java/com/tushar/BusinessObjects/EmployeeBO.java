package com.tushar.BusinessObjects;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBO implements Serializable {

	private int eno;
	private String ename;
	private String eadd;
	private double baseSal;
	private double grossSal;
	private double netSal;
	private Long phone;
	
}
