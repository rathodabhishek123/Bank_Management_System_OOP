package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class HDFC implements Rbi {
	
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	
	@Override
	public void createAccount() {
		
		System.out.println("-------------------");
		System.out.println("Create Account");
		System.out.println("-------------------");
		
		System.out.print("Enter Account Number:");
		int acc=sc.nextInt();
		ac.setAccNo(acc);
		
		System.out.print("Enter User Name:");
		String name=sc.next()+sc.nextLine();
		ac.setName(name);
		
		System.out.print("Enter Mobile Number:");
		String mob=sc.next();
		ac.setMobNo(mob);
		
		System.out.print("Enter Adhar Number:");
		String adhar=sc.next();
		ac.setAdharNo(adhar);
		
		System.out.print("Enter Gender:");
		String gender=sc.next();
		ac.setGender(gender);
		
		System.out.print("Enter Age:");
		int age=sc.nextInt();
		ac.setAge(age);
		
		System.out.println("Account Created Successfully..!");
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("---------------------");
		System.out.println("Display All Detail");
		System.out.println("---------------------");
		System.out.println("Account Number is: "+ac.getAccNo());
		System.out.println("User Name is: "+ac.getName());
		System.out.println("Mobile Number is: "+ac.getMobNo());
		System.out.println("Adhar Number is: "+ac.getAdharNo());
		System.out.println("Gender is: "+ac.getGender());
		System.out.println("Age is: "+ac.getAge());
		System.out.println("Balance is: "+ac.getBalance());
		
	}

	@Override
	public void depositeMoney() {

		System.out.println("-----------------");
		System.out.println("Deposite Money");
		System.out.println("-----------------");
		
		System.out.print("Enter a Deposite Amount: ");
		double deposite=sc.nextDouble();
		
		
		if(deposite>0) {
			
			double currentBalance=ac.getBalance();
			
			currentBalance=currentBalance+deposite;
			
			ac.setBalance(currentBalance);
			
			System.out.println("Amount Deposited Successfully.");
			System.out.println("Update Balance is:"+ac.getBalance());
		 }
		else {
			
			System.out.println("Invalide Amount!");
		}
	}

	@Override
	public void withdrawal() {
		
		System.out.println("-------------");
		System.out.println("Withdrawal");
		System.out.println("-------------");
		
		System.out.print("Enter a Withdrawal Amount:");
		double wd=sc.nextDouble();
		
		double currentBalance=ac.getBalance();
		
		if(wd>0 && wd<=currentBalance) {
		
		currentBalance=currentBalance-wd;
		
		ac.setBalance(currentBalance);
		
		System.out.println("Amount Withdrawal Successfully.");
		System.out.println("Update Balance is:"+ac.getBalance());
		}
		else {
			
			System.out.println("Insufficient Amount!");
		}	
		
	}

	@Override
	public void balanceCheck() {
		
		System.out.println("Your Total Current Balance is:"+ac.getBalance());
	
	}

	
}
