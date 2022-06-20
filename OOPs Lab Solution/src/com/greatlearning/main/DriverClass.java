package com.greatlearning.main;

import java.util.Scanner;

//Using the Scanner 

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Arun","Mathew");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		
		Scanner sc = new Scanner(System.in);
		
		int option = sc.nextInt();
		
		/*We can either use if and else if 
		 * or break and case
		 * for the options*/
		
		if(option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
			generatedPassword = cs.generatedPassword();
			cs.showCrendentials(employee, generatedEmail, generatedPassword);
		}
		
		else if(option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"admin");
			generatedPassword = cs.generatedPassword();
			cs.showCrendentials(employee, generatedEmail, generatedPassword);
		}
		
		else if(option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatedPassword();
			cs.showCrendentials(employee, generatedEmail, generatedPassword);
		}
		
		else if(option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");
			generatedPassword = cs.generatedPassword();
			cs.showCrendentials(employee, generatedEmail, generatedPassword);
		}
		
		else System.out.println("Enter a proper valid option");
		
		sc.close();
		
		
		

	}

}
