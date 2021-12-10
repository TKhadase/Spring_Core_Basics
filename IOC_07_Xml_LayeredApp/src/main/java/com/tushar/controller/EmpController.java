package com.tushar.controller;

import com.tushar.BusinessObjects.EmployeeBO;
import com.tushar.BusinessObjects.EmployeeDTO;
import com.tushar.BusinessObjects.EmployeeVo;
import com.tushar.service.iEmployeeService;

public class EmpController {

	private iEmployeeService service;
	
	public EmpController(iEmployeeService service) {
		this.service = service;
		
	}
	

	public String saveDetails(EmployeeVo empVo) throws Exception{
		System.out.println("EmpController.saveDetails()");
		EmployeeDTO empDTO = new EmployeeDTO();
		
		if(empVo.getEname() ==null || empVo.getBaseSal() ==null || empVo.getEadd() ==null || empVo.getPhone() ==null) {
			return "Please Input All required details";
		}
		
		//convert VO to DTO
		empDTO.setEname(empVo.getEname());
		empDTO.setEadd(empVo.getEadd());
		try {
		empDTO.setPhone(Long.valueOf(empVo.getPhone()));
		}catch(Exception e){
			System.out.println("EmpController.saveDetails() setPhone::"+e);
			return "Please enter proper phone number";
		}
		try {
		empDTO.setBaseSal(Double.valueOf(empVo.getBaseSal()));
		}catch(Exception e){
			System.out.println("EmpController.saveDetails() setBaseSal::"+e);
			return "Please enter proper Base Sal as number";
		}
		return service.saveEmpDetails(empDTO);
	}
	
	public EmployeeBO saveDetails(int empId) {
		return null;
	}
	
	
}
