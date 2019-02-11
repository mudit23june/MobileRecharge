package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidNumber;

public class AccountServiceImpl implements AccountService {
	AccountDao accountDao= new AccountDaoImpl();
	

	public AccountServiceImpl(AccountDao accountDao) {
		// TODO Auto-generated constructor stub
		this.accountDao = accountDao;
	}

	

	public AccountServiceImpl() {
		super();
	}



	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidNumber {
		return accountDao.getAccountDetails(mobileNo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) throws InvalidNumber {
		// TODO Auto-generated method stub
		return accountDao.rechargeAccount(mobileno, rechargeAmount);
	}

}
