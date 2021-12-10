package com.tushar.service;

import com.tushar.BusinessObjects.EmployeeBO;
import com.tushar.BusinessObjects.EmployeeDTO;
import com.tushar.dao.iEmployeeDAO;

public class EmployeeServiceImpl implements iEmployeeService {

	private iEmployeeDAO empDAO;

	public EmployeeServiceImpl(iEmployeeDAO empDAO) {
		this.empDAO = empDAO;
	}
	
	@Override
	public String saveEmpDetails(EmployeeDTO empDTO) throws Exception{
		System.out.println("EmployeeServiceImpl.saveEmpDetails()");
		
		EmployeeBO empBO = new EmployeeBO();
		
		//calculate gross & net Salary
		double grossSal = empDTO.getBaseSal() + empDTO.getBaseSal()*0.4f;// +40% on BasicSalary
		double netSal = grossSal -  empDTO.getBaseSal()*0.2f;  // - 20% on grossSalary
		
		empBO.setBaseSal(empDTO.getBaseSal());
		empBO.setGrossSal(grossSal);
		empBO.setNetSal(netSal);
		empBO.setEadd(empDTO.getEadd());
		empBO.setEname(empDTO.getEname());
		empBO.setPhone(empDTO.getPhone());
		
		return empDAO.save(empBO);
	}

	@Override
	public EmployeeBO getEmpDetails(int eid) {
		
		empDAO.getEmp(eid);
		return null;
	}


}
