package com.greatlearning.service;

import java.util.Random;

// Importing the Random for creating the Random Email and Password.

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatedPassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()+-/*<>?";

		String Values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		//Using the Random Method

		Random random = new Random();
		
		//Using the charAt and nextInt for the password Generation
		

		char[] password = new char[10];
		for (int i = 0; i < 10; i++) {
			password[i] = Values.charAt(random.nextInt(Values.length()));
		}
		return password;

	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + "abc.com";

	}

	public void showCrendentials(Employee employee, String email, char[] generatePassword) {

		System.out.println("Dear" +" "+ employee.getFirstName()+" " +employee.getLastName()+" " + "your generated crendentials are as follows");
		System.out.println("Email  -->"+"  " + email);
		System.out.print("Password  -->  ");
		System.out.print(generatedPassword());
	}

}