package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidNumber;

public class AccountDaoImpl implements AccountDao {
	Map <String,Account> accountEntry; 
	public AccountDaoImpl()
	{
		accountEntry=new HashMap<>();
		accountEntry.put("1111111111", new Account("Prepaid","Ravi",100));
		accountEntry.put("2222222222", new Account("Prepaid","pili wali",200));
		accountEntry.put("3333333333", new Account("Prepaid","lal wali",300));
		accountEntry.put("4444444444", new Account("Prepaid","nili wali",400));
	}
	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidNumber {
		// TODO Auto-generated method stub
		for(Entry<String,Account> entry:accountEntry.entrySet())
		{
			if(entry.getKey().equals(mobileNo))
				return(entry.getValue());
		}
		
		throw new InvalidNumber();
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) throws InvalidNumber {
		// TODO Auto-generated method stub
		if(this.getAccountDetails(mobileno)!=null)
		{
		Account account=this.getAccountDetails(mobileno);
		account.setAccountBalance(rechargeAmount+account.getAccountBalance());
		return 1;
		}
		else
			return 0;
	}

}
