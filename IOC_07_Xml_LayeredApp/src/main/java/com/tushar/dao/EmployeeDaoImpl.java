package com.tushar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.tushar.BusinessObjects.EmployeeBO;

public class EmployeeDaoImpl implements iEmployeeDAO {
	
	//create table SPRING07_EMP ( eno varchar2(10), ename varchar2(10), BasicSalary number, eadd varchar2(20), phone number ,
	//GrossSal number, NetSal number);
	
	//CREATE SEQUENCE SPRING07_EMP_SEQ START WITH 1;
	private static final String  EMP_INSERT_QUERY="INSERT INTO SPRING07_EMP VALUES( SPRING07_EMP_SEQ.NEXTVAL, ?, ?, ? , ? , ?, ? )";

	private DataSource ds;
	
	public EmployeeDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public String save(EmployeeBO empBO) throws Exception{
		System.out.println("EmployeeDaoImpl.save()");
		int count = 0 ;
		Connection con=null;
		try {
			 con =ds.getConnection();
			PreparedStatement ps  = con.prepareStatement(EMP_INSERT_QUERY);
			ps.setString(1,   empBO.getEname());
			ps.setString(2,  ""+ empBO.getBaseSal());
			ps.setString(3,   empBO.getEadd());
			ps.setString(4,   ""+empBO.getPhone());
			ps.setString(5,   ""+empBO.getGrossSal());
			ps.setString(6,   ""+empBO.getNetSal());
			count = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally  {
			if(con!=null)
				con.close();
		}
		if(count>0)
			return "Employee Details saved succesfully";
		else
		return "failed to save Employee Details";
	}

	@Override
	public EmployeeBO getEmp(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
