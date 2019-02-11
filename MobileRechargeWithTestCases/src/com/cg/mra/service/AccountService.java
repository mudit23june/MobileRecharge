package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidNumber;

public interface AccountService {
	public Account getAccountDetails(String mobileNo) throws InvalidNumber;
	public int rechargeAccount(String mobileno,double rechargeAmount) throws InvalidNumber;
	

}
