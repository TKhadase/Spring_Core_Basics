package com.tushar.BusinessObjects;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeVo implements Serializable {

	private String ename;
	private String eadd;
	private String baseSal;
	private String phone;
	
}
