package com.tushar.service;

import com.tushar.BusinessObjects.EmployeeBO;
import com.tushar.BusinessObjects.EmployeeDTO;

public interface iEmployeeService {

	public String saveEmpDetails(EmployeeDTO  emp) throws Exception;
	public EmployeeBO  getEmpDetails(int  eid);
	
}
