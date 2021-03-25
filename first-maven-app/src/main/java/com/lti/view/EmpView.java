package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1002);
		emp.setEmpName("Justin");
		
		System.out.println("Id: "+emp.getEmpid());
		System.out.println("Name"+emp.getEmpName());
	
	}

}
