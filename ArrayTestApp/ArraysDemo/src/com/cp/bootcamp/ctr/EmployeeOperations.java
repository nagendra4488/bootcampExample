package com.cp.bootcamp.ctr;

import java.util.Scanner;

import com.cp.bootcamp.bean.Employee;

public class EmployeeOperations {
	Employee arr[] = new Employee[100];
	static int index = 0;
	Scanner sc = new Scanner(System.in);
	
	public boolean addEmployee(Employee e)
	{
		arr[index++] = e;
		return true;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e = null;
		for (int i = 0; i < index; i++) {
			if(arr[i].getCode() == id)
			{
				return arr[i];
			}
		}
		return e;
	}
	
	public Employee updateEmployee() {
		
		System.out.println("Enter percent of slary to be increased ");
		int value = sc.nextInt();
		System.out.println("Enter Project of Employee to be incremented");
		String prjct = sc.next();
	//	System.out.println("Salary before Updation is "+emp.getSalary());
		Employee em = new Employee();
		for (int i = 0; i < index; i++) {
			
			if(arr[i].getProject()==prjct) {
			
				
				int sal = arr[i].getSalary();
			sal = sal+(sal*(value/100));
			arr[i].setSalary(sal);
			
			return arr[i];
			}
			
		}
		 return null;
			
	}
	
	
	public Employee[] displayEmployees() {
		
		
		return arr;
	}

}
