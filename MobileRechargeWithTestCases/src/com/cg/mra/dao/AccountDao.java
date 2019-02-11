package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidNumber;

public interface AccountDao {
	public Account getAccountDetails(String mobileNo) throws InvalidNumber;
	public int rechargeAccount(String mobileno,double rechargeAmount) throws InvalidNumber;
}
