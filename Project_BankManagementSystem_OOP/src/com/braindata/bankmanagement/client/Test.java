package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.serviceImpl.*;

import java.util.Scanner;

import com.braindata.bankmanagement.service.*;

	public class Test {
		
		public static void main(String[] args) {
			
			System.out.println("Select Your Bank");
			System.out.println("<<------------------>>");
			System.out.println("1.Sbi");
			System.out.println("2.IPPB");
			System.out.println("3.CBI");
			System.out.println("4.BOI");
			System.out.println("5.HDFC");
			
			Scanner sc=new Scanner(System.in);
			//System.out.println();
			System.out.print("Enter Your Option: ");
			int bankname=sc.nextInt();
			System.out.println();
		
			Rbi bank=null;
	
switch(bankname) {
		
	case 1:
		System.out.println("Welcome to State Bank of India");
		 bank=new Sbi();
		break;
		
	case 2:
		System.out.println(" Welcome to Indian Post Payment Bank");
		bank=new IPPB();
		break;
		
	case 3:
		System.out.println("Welcome to Central Bank of India");
		 bank=new CBI();
		 break;
		
	case 4:
		System.out.println("Welcome to Bank of India");
		 bank=new BOI();
		break;
		
	case 5:
		System.out.println("Welcome to Housing Development Finance Corporation Bank");
		bank=new HDFC();
		break;
		
		
	}
				
		while(true) {
			//System.out.println();
			System.out.println("Menu(Select One Option)");
			System.out.println("1.CreateAccount");
			System.out.println("2.DisplayAllDetails");
			System.out.println("3.DepositeMoney");
			System.out.println("4.Withdrawal");
			System.out.println("5.BalanceCheck");
			System.out.println("6.Exit");
			System.out.println("____________________");
			
			
			System.out.println();
			int a=sc.nextInt();
			
	switch(a){
			
		case 1: 
			bank.createAccount();
			break;
		
		case 2:
			bank.displayAllDetails();
			break;
		
		case 3: 
			bank.depositeMoney();
			break;
		
		case 4: 
			bank.withdrawal();
			break;
		
		case 5:
				bank.balanceCheck();
				break;
		
		case 6:
			System.out.println("Thank You");
			System.exit(0);
			break;
			
		default:
			
			System.out.println("This Option not Valid , Please Enter the Above Option ");
			}
		}
	}
}
	
	
	//if(bankname==1) {
//	
//System.out.println("Welcome to State Bank of India");
//	Rbi bank=new Sbi();


		
//	else if(bankname==2) {
//		
//			System.out.println(" Welcome to Indian Post Payment Bank");
//			Rbi bank=new IPPB();
//			
//			while(true) {
//				System.out.println();
//				System.out.println("Menu(Select One Option)");
//				System.out.println("1.CreateAccount");
//				System.out.println("2.DisplayAllDetails");
//				System.out.println("3.DepositeMoney");
//				System.out.println("4.Withdrawal");
//				System.out.println("5.BalanceCheck");
//				System.out.println("6.Exit");
//				System.out.println("____________________");
//				
//				
//				System.out.println();
//				int a=sc.nextInt();
//				
//				
//				
//			if(a==1) {
//				
//				bank.createAccount();
//			}
//			
//			else if(a==2) {
//				
//				bank.displayAllDetails();
//			}
//			
//			else if(a==3) {
//				
//				bank.depositeMoney();
//			}
//			
//			else if(a==4) {
//				
//				bank.withdrawal();
//			}
//			
//			else if(a==5) {
//				
//				bank.balanceCheck();
//			}
//			else if(a==6) {
//				System.out.println("Thank You");
//				System.exit(0);
//				
//			}
//			else {
//				
//				System.out.println("This Option not Valid , Please Enter the Above Option ");
//			}
//			
//			
//		}
//	
//   }
//	
//	else if(bankname==3) {
//		
//		System.out.println("Welcome to Central Bank of India");
//		Rbi bank=new IPPB();
//		
//		while(true) {
//			System.out.println();
//			System.out.println("Menu(Select One Option)");
//			System.out.println("1.CreateAccount");
//			System.out.println("2.DisplayAllDetails");
//			System.out.println("3.DepositeMoney");
//			System.out.println("4.Withdrawal");
//			System.out.println("5.BalanceCheck");
//			System.out.println("6.Exit");
//			System.out.println("____________________");
//			
//			
//			System.out.println();
//			int a=sc.nextInt();
//			
//			
//			
//		if(a==1) {
//			
//			bank.createAccount();
//		}
//		
//		else if(a==2) {
//			
//			bank.displayAllDetails();
//		}
//		
//		else if(a==3) {
//			
//			bank.depositeMoney();
//		}
//		
//		else if(a==4) {
//			
//			bank.withdrawal();
//		}
//		
//		else if(a==5) {
//			
//			bank.balanceCheck();
//		}
//		else if(a==6) {
//			System.out.println("Thank You");
//			System.exit(0);
//			
//		}
//		else {
//			
//			System.out.println("This Option not Valid , Please Enter the Above Option ");
//		}
//		
//		
//	}
//
//}
//
//	else if(bankname==4) {
//		
//		System.out.println("Welcome to Bank of India");
//		Rbi bank=new IPPB();
//		
//		while(true) {
//			System.out.println();
//			System.out.println("Menu(Select One Option)");
//			System.out.println("1.CreateAccount");
//			System.out.println("2.DisplayAllDetails");
//			System.out.println("3.DepositeMoney");
//			System.out.println("4.Withdrawal");
//			System.out.println("5.BalanceCheck");
//			System.out.println("6.Exit");
//			System.out.println("____________________");
//			
//			
//			System.out.println();
//			int a=sc.nextInt();
//			
//			
//			
//		if(a==1) {
//			
//			bank.createAccount();
//		}
//		
//		else if(a==2) {
//			
//			bank.displayAllDetails();
//		}
//		
//		else if(a==3) {
//			
//			bank.depositeMoney();
//		}
//		
//		else if(a==4) {
//			
//			bank.withdrawal();
//		}
//		
//		else if(a==5) {
//			
//			bank.balanceCheck();
//		}
//		else if(a==6) {
//			System.out.println("Thank You");
//			System.exit(0);
//			
//		}
//		else {
//			
//			System.out.println("This Option not Valid , Please Enter the Above Option ");
//		}
//		
//		
//	}
//
//}
//
//	else if(bankname==5) {
//		
//		System.out.println("Welcome to Housing Development Finance Corporation Bank");
//		Rbi bank=new IPPB();
//		
//		while(true) {
//			System.out.println();
//			System.out.println("Menu(Select One Option)");
//			System.out.println("1.CreateAccount");
//			System.out.println("2.DisplayAllDetails");
//			System.out.println("3.DepositeMoney");
//			System.out.println("4.Withdrawal");
//			System.out.println("5.BalanceCheck");
//			System.out.println("6.Exit");
//			System.out.println("____________________");
//			
//			
//			System.out.println();
//			int a=sc.nextInt();
//			
//			
//			
//		if(a==1) {
//			
//			bank.createAccount();
//		}
//		
//		else if(a==2) {
//			
//			bank.displayAllDetails();
//		}
//		
//		else if(a==3) {
//			
//			bank.depositeMoney();
//		}
//		
//		else if(a==4) {
//			
//			bank.withdrawal();
//		}
//		
//		else if(a==5) {
//			
//			bank.balanceCheck();
//		}
//		else if(a==6) {
//			System.out.println("Thank You");
//			System.exit(0);
//			
//		}
//		else {
//			
//			System.out.println("This Option not Valid , Please Enter the Above Option ");
//		}
//		
//		
//	}
//
//}

	

