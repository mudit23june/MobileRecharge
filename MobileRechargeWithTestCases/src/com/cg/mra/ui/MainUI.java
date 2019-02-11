package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.exceptions.InvalidNumber;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) throws InvalidNumber {
		// TODO Auto-generated method stub
		AccountService accountService=new AccountServiceImpl();
		Scanner sc= new Scanner(System.in);
		int n;
		String mobileNumber;
		double amount;
		while(true)
		{
			System.out.println("---------------------------------Menu--------------------------------");
			System.out.println("1.Balanace Enquiry");
			System.out.println("2.Recharge Account");
			System.out.println("3.Exit");
			System.out.println("Please Enter the choice");
			n=sc.nextInt();
			sc.nextLine();
			switch(n)
			{
			case 1:System.out.println("Enter the mobile number");
			       mobileNumber=sc.nextLine();
			       if(accountService.getAccountDetails(mobileNumber)!=null)
			       {
			    	   System.out.println("Your account Balance is "+accountService.getAccountDetails(mobileNumber).getAccountBalance());
			       }
			       else
			       {
			    	   System.out.println("Mobile Number Does not exist");
			       }
			       break;
			case 2:System.out.println("Enter the mobile number");
		       mobileNumber=sc.nextLine();
		       System.out.println("Enter the Recharge Amount");
		       amount=sc.nextDouble();
		       if(accountService.getAccountDetails(mobileNumber)!=null)
		       {
		    	   accountService.rechargeAccount(mobileNumber, amount);
		    	   System.out.println("You have recharge with amount "+amount+" Now, your account balance is  "+accountService.getAccountDetails(mobileNumber).getAccountBalance());
		       }
		       else
		       {
		    	   System.out.println("Mobile Number Does not exist");
		       }
		       break;
			case 3: sc.close();
			        System.exit(0);
			        break;
			        default: System.out.println("You have entered an Invalid choice");
			}
			
		}
		

	}

}
