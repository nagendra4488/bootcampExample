package com.cp.bootcamp.exe;

import java.util.Scanner;

import com.cp.bootcamp.bean.Employee;
import com.cp.bootcamp.ctr.EmployeeOperations;

public class HRApp {

	Scanner sc = new Scanner(System.in);
	EmployeeOperations operations = new EmployeeOperations();
 //  	 static Employee emp = new Employee();
	
	public static void main(String[] args) {
		HRApp hrapp = new HRApp();
		
		while(true)
		{
			System.out.println(" === MENU ====");
			System.out.println("1. Add Employee");
			System.out.println("2. Get Employee By ID");
			System.out.println("3. Update Employee Salary By Project"); // increase the salary of employee by x% (given by user) working on same project
			System.out.println("4. Display All Employees");
			System.out.println("0. Exit");
			
			System.out.println("Enter Your Choice ");
			int choice = Integer.parseInt(hrapp.sc.nextLine());
			
			switch(choice)
			{
				case 1: hrapp.createNewEmployee();
				break;
				
				case 2: hrapp.searchEmployeeById();
				break;
				
				case 3: hrapp.updateEmployee();
				break;
				
				case 4: hrapp.displayEmployees();
				break;
				
				case 0: System.exit(0);
			}
			
		}//end while
		
		
	}//end main
	
	public void createNewEmployee()
	{
		System.out.println("Enter Name ");
		String empName = sc.nextLine();
		System.out.println("Enter Code ");
		int code = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Project ");
		String project = sc.nextLine();

		Employee e = new Employee(code, empName, salary, project);
		
		operations.addEmployee(e);
	}
	
	public void searchEmployeeById()
	{
		System.out.println("Enter Code ");
		int code = Integer.parseInt(sc.nextLine());
		
		Employee e = operations.getEmployeeById(code);
		displayEmployeeDetails(e);
	}
	
	
	
	public void displayEmployeeDetails(Employee e)
	{
		System.out.println(" Employee Name "+e.getName());
		System.out.println(" Employee Code "+e.getCode());
		System.out.println(" Employee Project "+e.getProject());
		System.out.println(" Employee Salary "+e.getSalary());
	//	System.out.println(e);
		
	}
	
	
	
   public void updateEmployee() {
		
	   
	   System.out.println("Enter percent of slary to be increased ");
		int value = sc.nextInt();
		System.out.println("Enter Project of Employee to be incremented");
		String prjct = sc.next();
		
		Employee employ = operations.updateEmployee(value,prjct);
		
		System.out.println("After increment salary is "+employ.getSalary());
		
	}
	
	
	public void displayEmployees() {
		
	 Employee[] arr= operations.displayEmployees();
	 
	 int index = operations.getIndex();
	 
   System.out.println(arr[index]);
	 
	// System.out.println(arr);
	 
	
	/*
	 * for(int i=0;i<arr.length;i++) { if(arr[i]!=null) {
	 * System.out.println(arr[i]); }}
	 */ 	
		
	}
	

}
