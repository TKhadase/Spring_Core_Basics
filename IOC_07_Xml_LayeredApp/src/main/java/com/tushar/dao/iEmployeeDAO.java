package com.tushar.dao;

import com.tushar.BusinessObjects.EmployeeBO;
import com.tushar.BusinessObjects.EmployeeVo;

public interface iEmployeeDAO {

	public String save(EmployeeBO  emp) throws Exception;
	public EmployeeBO  getEmp(int  eid);
	
}
